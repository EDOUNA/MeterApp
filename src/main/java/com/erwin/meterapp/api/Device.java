package com.erwin.meterapp.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

import com.erwin.meterapp.persistence.model.ConfigurationsModel;
import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import com.erwin.meterapp.persistence.repository.ConfigurationsRepository;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsRepository;

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
        System.out.println(DomoticzProdURL.toString());

        log.info("Trying to fetch JSON");
        HttpClient client = httpClient
    }
}