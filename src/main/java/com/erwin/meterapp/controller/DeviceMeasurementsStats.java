package com.erwin.meterapp.controller;

import com.erwin.meterapp.dto.devicemeasurements.BudgetDto;
import com.erwin.meterapp.persistence.model.ConfigurationsModel;
import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import com.erwin.meterapp.persistence.model.DeviceMeasurementsStatsModel;
import com.erwin.meterapp.persistence.model.DevicesModel;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsStatsRepository;
import com.erwin.meterapp.service.ConfigurationsService;
import com.erwin.meterapp.service.DeviceMeasurementsService;
import com.erwin.meterapp.service.DevicesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
public class DeviceMeasurementsStats {

    private static final Logger log = LoggerFactory.getLogger(DeviceMeasurementsStats.class);

    @Autowired
    private DevicesService devicesService;

    @Autowired
    private DeviceMeasurementsStatsRepository deviceMeasurementsStatsRepository;

    @Autowired
    private DeviceMeasurementsService deviceMeasurementsService;

    @Autowired
    private ConfigurationsService configurationsService;

    @Async
    public void updateStatsTable() {
        log.info("Starting update process");

        // Loop through all active devices
        List<DevicesModel> devices = devicesService.findByActive();
        for (DevicesModel device : devices) {
            // Find all measurements made today
            List<DeviceMeasurementsModel> measurements = deviceMeasurementsService.findByDeviceIdAndCreatedToday(device.getId());
            if (null == measurements) {
                log.warn("No measurements (yet) found. Whilst this is odd, let's retry in the next batch.");
                return;
            }

            // Calculate how much has been consumed
            DeviceMeasurementsModel firstElement = measurements.get(0);
            DeviceMeasurementsModel lastElement = measurements.get(measurements.size() - 1);
            float consumed = lastElement.getAmount() - firstElement.getAmount();
            System.out.println("Consumption for device " + device.getDescritpion() + " is " + consumed);

            // Now try to see if this record is already present in the stats table
            Integer currentHour = LocalTime.now().getHour();
            DeviceMeasurementsStatsModel statsModel = deviceMeasurementsStatsRepository.findByDeviceAndTariffAndHour(device.getId(), device.getTariffsModel().getId(), currentHour);

            // No stats row has been found, create a new one
            if (null == statsModel) {
                DeviceMeasurementsStatsModel newModel = new DeviceMeasurementsStatsModel();
                newModel.setAmount(consumed);
                newModel.setDevice(device);
                newModel.setTariff(device.getTariffsModel());
                newModel.setHour(currentHour);

                // All set, save the record
                deviceMeasurementsStatsRepository.save(newModel);

                // Since we are done here, continue the loop - no update is needed
                continue;
            }

            // If found, update the record
            statsModel.setAmount(consumed);
            deviceMeasurementsStatsRepository.save(statsModel);
        }
        log.info("Finished updating the statistics table");
    }

    /**
     * @param device
     * @return
     */
    public BudgetDto getBudget(DevicesModel device) {
        // First find some active devices to generate a budget

        BudgetDto budget = new BudgetDto();
        List<DevicesModel> devices = devicesService.findByActive();
        ConfigurationsModel configurationsModel = configurationsService.findBySetting("energy_monthly_budget");
        float budgetPerMonth = Float.parseFloat(configurationsModel.getParameter());

        // Only for the current day
        // @TODO make proper functions to support weekly and monthly calls
        int daysInMonth = LocalDate.now().lengthOfMonth();
        int currentDay = LocalDate.now().getDayOfMonth();
        int daysRemaining = (daysInMonth - currentDay);
        float daysPercentage = Math.round(100 - ((float) daysRemaining / (float) daysInMonth) * 100);
        float budgetPerDay = (budgetPerMonth / daysInMonth);

        budget.setDaysRemaining(daysRemaining);
        budget.setDevices(device);
        budget.setDaysPercentage(daysPercentage);
        budget.setMonthlyBudget(budgetPerMonth);
        budget.setBudgetAllowed(budgetPerDay);

        // Basics set, find the last made measurement
        DeviceMeasurementsModel lastMeasurement = deviceMeasurementsService.findLastMadeMeasurement(device.getId());
        System.out.println(lastMeasurement.toString());

        System.out.println(budget.toString());
        return budget;
    }
}