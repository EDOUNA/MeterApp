package com.erwin.meterapp.rest;

import com.erwin.meterapp.controller.DeviceMeasurementsStats;
import com.erwin.meterapp.dto.devicemeasurements.BudgetDto;
import com.erwin.meterapp.persistence.model.DevicesModel;
import com.erwin.meterapp.service.DevicesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class api {
    private static final Logger log = LoggerFactory.getLogger(api.class);

    @Autowired
    private DeviceMeasurementsStats deviceMeasurementsStats;

    @Autowired
    private DevicesService devicesService;

    @GetMapping("getCurrentConsumption/deviceId/{deviceId}")
    public ResponseEntity<?> getCurrentConsumption(@PathVariable Integer deviceId) {
        log.info("Request param:" + deviceId);
        DevicesModel device = devicesService.findById(deviceId);
        if (null == device) {
            return new ResponseEntity<String>("No device found with device ID " + deviceId, HttpStatus.NOT_FOUND);
        }

        BudgetDto budget = deviceMeasurementsStats.getBudget(device);

        return new ResponseEntity<String>("HERE", HttpStatus.OK);
    }
}
