package com.erwin.meterapp.api;

import com.erwin.meterapp.dao.domoticz.Result;
import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import com.erwin.meterapp.persistence.model.DeviceTariffsModel;
import com.erwin.meterapp.persistence.model.DevicesModel;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsRepository;
import com.erwin.meterapp.persistence.repository.DeviceTariffRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DeviceMeasurements {

    private static final Logger log = LoggerFactory.getLogger(DeviceMeasurements.class);

    @Autowired
    private DeviceTariffRepository deviceTariffRepository;

    /**
     * @param device
     * @param entity
     * @return
     */
    public boolean createMeasurement(DevicesModel device, Result entity, DeviceMeasurementsRepository deviceMeasurementsRepository) {
        log.info("Creating measurement for device ID: " + device.getId());

        // Determine the right counter value
        // Proper formatting is like "400 kWh", or "300 m3". The first spot contains the actual amount
        String[] counterValue = entity.getCounterToday().split(" ");

        try {
            // Insert a new record
            DeviceMeasurementsModel measurementsModel = new DeviceMeasurementsModel();
            measurementsModel.setDeviceId((int) device.getId());
            measurementsModel.setAmount(Float.parseFloat(counterValue[0]));

            // Find and set the active device tariff
            measurementsModel.setDeviceTariffs(this.findActiveDeviceTariff(device));

            // Save the entity
            deviceMeasurementsRepository.save(measurementsModel);
        } catch (Exception e) {
            log.error("Unable to insert new record for device " + device.getDescritpion() + ". Stacktrace: " + e.getStackTrace());
            return false;
        }

        return true;
    }

    /**
     * @param device
     * @return
     */
    public DeviceTariffsModel findActiveDeviceTariff(DevicesModel device) {
        DeviceTariffsModel deviceTariffsModel = deviceTariffRepository.findActiveTariffByDeviceId((int) device.getId());

        return deviceTariffsModel;
    }
}
