package com.erwin.meterapp.api;

import com.erwin.meterapp.dao.domoticz.Main;
import com.erwin.meterapp.dao.domoticz.Result;
import com.erwin.meterapp.persistence.model.ConfigurationsModel;
import com.erwin.meterapp.persistence.model.DevicesModel;
import com.erwin.meterapp.persistence.repository.ConfigurationsRepository;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsRepository;
import com.erwin.meterapp.persistence.repository.DevicesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class Devices {

    private static final Logger log = LoggerFactory.getLogger(Devices.class);
    private final String ConfigurationString = "domoticz_meter_prod_url";

    @Autowired
    private DeviceMeasurementsRepository deviceMeasurementsRepository;

    @Autowired
    private ConfigurationsRepository configurationsRepository;

    @Autowired
    private DevicesRepository devicesRepository;

    public void BatchProcessDeviceMeasurements() {
        log.info("Loading configuration for " + this.ConfigurationString);
        ConfigurationsModel DomoticzProdURL = configurationsRepository.findBySetting(this.ConfigurationString);
        log.info("Done loading configuration settings for " + this.ConfigurationString);

        RestTemplate restTemplate = new RestTemplate();

        Main entity = null;
        try {
            entity = restTemplate.getForObject(DomoticzProdURL.getParameter(), Main.class);
        } catch (Exception e) {
            log.error("Failed fetching message from Domoticz. Error message returned: " + e.getMessage());
            return; // End the scheduled task here
        }

        // Loop through the results array
        for (Result result : entity.result) {
            // First try to see if the deviceID is matched with the IDX and if it's active
            Integer indentifier = result.getIdx();
            DevicesModel device = devicesRepository.findByIdentifierAndActive(indentifier);

            // Stop processing if nothing is found
            if (null == device) {
                log.warn("No (active) device found for device ID: " + indentifier);
                break;
            }

            // Create a new measurement
            DeviceMeasurements measurements = new DeviceMeasurements();
            measurements.createMeasurement(device, result, deviceMeasurementsRepository);

            log.info("Done processing for device " + device.getDescritpion());
        }

        log.info("Done processing all measurements");
    }
}