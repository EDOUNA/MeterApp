package com.erwin.meterapp.api;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import com.erwin.meterapp.persistence.model.DeviceMeasurementsStatsModel;
import com.erwin.meterapp.persistence.model.DevicesModel;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsRepository;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsStatsRepository;
import com.erwin.meterapp.persistence.repository.DevicesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void updateStatsTable() {
        // Loop through all active devices
        List<DevicesModel> devices = devicesRepository.findByActive();

        for (DevicesModel device : devices) {
            // Find all measurements made today
            List<DeviceMeasurementsModel> measurements;

            try {
                measurements = deviceMeasurementsRepository.findByDeviceIdAndCreatedToday((int) device.getId());
            } catch (Exception e) {
                log.error("Unable to fetch data for all measurements. Stacktrace: " + e.getStackTrace());
                return;
            }

            if (null == measurements) {
                log.warn("No measurements (yet) found. Whilst this is odd, let's retry in the next batch.");
                return;
            }

            // Calculate how much has been consumed
            DeviceMeasurementsModel firstElement = measurements.get(0);
            DeviceMeasurementsModel lastElement = measurements.get(measurements.size() - 1);
            float consumed = lastElement.getAmount() - firstElement.getAmount();

            System.out.println(consumed);

            // Now try to see if this record is already present in the stats table
            DeviceMeasurementsStatsModel statsModel = deviceMeasurementsStatsRepository.findByDeviceAndTariffAndHour(device.getId(), device.getTariffsModel().getId(), LocalTime.now().getHour());
        }


    }
}