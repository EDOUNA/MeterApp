package com.erwin.meterapp.controller;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import com.erwin.meterapp.persistence.model.DeviceMeasurementsStatsModel;
import com.erwin.meterapp.persistence.model.DevicesModel;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsRepository;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsStatsRepository;
import com.erwin.meterapp.persistence.repository.DevicesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;

import java.time.LocalTime;
import java.util.List;

@Controller
public class DeviceMeasurementsStats {

    private static final Logger log = LoggerFactory.getLogger(DeviceMeasurementsStats.class);

    @Autowired
    private DeviceMeasurementsRepository deviceMeasurementsRepository;

    @Autowired
    private DevicesRepository devicesRepository;

    @Autowired
    private DeviceMeasurementsStatsRepository deviceMeasurementsStatsRepository;

    @Async
    public void updateStatsTable() {
        // Loop through all active devices
        final List<DevicesModel> devices = devicesRepository.findByActive();

        for (final DevicesModel device : devices) {
            // Find all measurements made today
            final List<DeviceMeasurementsModel> measurements = deviceMeasurementsRepository.findByDeviceIdAndCreatedToday(device.getId());
            if (null == measurements) {
                log.warn("No measurements (yet) found. Whilst this is odd, let's retry in the next batch.");
                return;
            }

            // Calculate how much has been consumed
            final DeviceMeasurementsModel firstElement = measurements.get(0);
            final DeviceMeasurementsModel lastElement = measurements.get(measurements.size() - 1);
            final float consumed = firstElement.getAmount() - lastElement.getAmount();
            System.out.println("Consumption for device " + device.getDescritpion() + " is " + consumed);

            // Now try to see if this record is already present in the stats table
            final Integer currentHour = LocalTime.now().getHour();
            final DeviceMeasurementsStatsModel statsModel = deviceMeasurementsStatsRepository.findByDeviceAndTariffAndHour(device.getId(), device.getTariffsModel().getId(), currentHour);

            // No stats row has been found, create a new one
            if (null == statsModel) {
                final DeviceMeasurementsStatsModel newModel = new DeviceMeasurementsStatsModel();
                newModel.setAmount(consumed);
                newModel.setDevice(device);
                newModel.setTariff(device.getTariffsModel());
                newModel.setHour(currentHour);

                // All set, save the record
                deviceMeasurementsStatsRepository.save(newModel);

                // Since we are done here, continue the loop for other devices
                continue;
            }

            // If found, update the record
            statsModel.setAmount(consumed);
            deviceMeasurementsStatsRepository.save(statsModel);
        }
    }
}