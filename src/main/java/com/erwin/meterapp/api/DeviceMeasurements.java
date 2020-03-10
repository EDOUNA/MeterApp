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
     * Create a measurement
     * @param device
     * @param entity
     * @param deviceMeasurementsRepository
     * @return
     */
    public boolean createMeasurement(DevicesModel device, Result entity, DeviceMeasurementsRepository deviceMeasurementsRepository) {
        // Determine the right counter value
        // Proper formatting is like "400 kWh", or "300 m3". The first spot contains the actual amount
        String[] counterValue = entity.getCounterToday().split(" ");

        // Try to find an active set device tariff
        DeviceTariffsModel deviceTariff = this.findActiveDeviceTariff(device);
        if (null == deviceTariff) {
            log.warn("No active or valid device tariff found for " + device.getDescritpion());
            return false;
        }

        try {
            // Insert a new record
            DeviceMeasurementsModel measurementsModel = new DeviceMeasurementsModel();
            measurementsModel.setDeviceId((int) device.getId());
            measurementsModel.setAmount(Float.parseFloat(counterValue[0]));

            // Find and set the active device tariff
            measurementsModel.setDeviceTariffs(deviceTariff);

            // Save the entity
            deviceMeasurementsRepository.save(measurementsModel);
        } catch (Exception e) {
            log.error("Unable to insert new record for device " + device.getDescritpion() + ". Stacktrace: " + e.getStackTrace());
            return false;
        }
        return true;
    }

    /**
     * Find an active and valid device tariff
     * @param device
     * @return
     */
    public DeviceTariffsModel findActiveDeviceTariff(DevicesModel device) {
        DeviceTariffsModel deviceTariffsModel = null;

        try {
            deviceTariffsModel = deviceTariffRepository.findActiveTariffByDeviceId(device.getTariffsModel().getId());
        } catch (Exception e) {
            log.error("Unable to perform device tariff query. Stacktrace: " + e.getStackTrace());
        }

        return deviceTariffsModel;
    }
}