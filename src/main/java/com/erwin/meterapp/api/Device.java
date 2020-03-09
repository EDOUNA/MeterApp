package com.erwin.meterapp.api;

import com.erwin.meterapp.dao.domoticz.Main;
import com.erwin.meterapp.persistence.model.ConfigurationsModel;
import com.erwin.meterapp.persistence.repository.ConfigurationsRepository;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class Device {

    private static final Logger log = LoggerFactory.getLogger(Device.class);
    private final String ConfigurationString = "domoticz_meter_prod_url";

    @Autowired
    private DeviceMeasurementsRepository deviceMeasurementsRepository;

    @Autowired
    private ConfigurationsRepository configurationsRepository;

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

        System.out.println(entity.getServerTime());

        log.info("Done creating measurements.");
    }
}