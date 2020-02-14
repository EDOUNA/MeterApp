package com.erwin.meterapp.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsRepository;

@Controller
public class Device {

    private static final Logger log = LoggerFactory.getLogger(Device.class);

    @Autowired
    private DeviceMeasurementsRepository deviceMeasurementsRepository;

    public void BatchProcessDeviceMeasurements() {
        log.info("trying to start...");

        List<DeviceMeasurementsModel> deviceMeasurements = deviceMeasurementsRepository.findAll();

        // log.info(deviceMeasurements.toString());

        // System.out.println(deviceMeasurements.toString());
        log.info("Done loading");

        for (int i = 0; i < deviceMeasurements.size(); i++) {
            //log.info(deviceMeasurements.get(i).toString());
        }
    }
}