package com.erwin.meterapp.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

import com.erwin.meterapp.model.DeviceMeasurements;
import com.erwin.meterapp.service.IDeviceMeasurements;

@Controller
public class Device {

    private static final Logger log = LoggerFactory.getLogger(Device.class);

    @Autowired
    IDeviceMeasurements deviceMeasurementsService;

    /**
     * Main constructor
     */
    public Device() {

    }

    public void BatchProcessDeviceMeasurements() {
        log.info("trying to start...");

        // Find all measurements
        List<DeviceMeasurements> deviceMeasurements = (List<DeviceMeasurements>) deviceMeasurementsService.findAll();
        if (deviceMeasurements == null) {
            log.error("no data found");
        }
        log.info("Done loading");
    }
}