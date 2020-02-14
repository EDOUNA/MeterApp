package com.erwin.meterapp.scheduledTasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.erwin.meterapp.api.Device;

@Component
public class MeterAppSchedule {

    private static final Logger log = LoggerFactory.getLogger(MeterAppSchedule.class);

    @Scheduled(fixedRate = 5000)
    public void reportCurrentLog() {
        log.info("Creating device class instance");
        
        // Create a new device instance to proper handle the logging
        Device device = new Device();
        device.BatchProcessDeviceMeasurements();
    }
}