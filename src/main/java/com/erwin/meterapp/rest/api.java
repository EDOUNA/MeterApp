package com.erwin.meterapp.rest;

import com.erwin.meterapp.controller.DeviceMeasurementsStats;
import com.erwin.meterapp.dto.devicemeasurements.budget.BudgetDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class api {
    private static final Logger log = LoggerFactory.getLogger(api.class);

    @Autowired
    private DeviceMeasurementsStats deviceMeasurementsStats;

    @GetMapping("getCurrentConsumption")
    public ResponseEntity<?> getCurrentConsumption() {
        BudgetDto budget = deviceMeasurementsStats.getBudget();
        return new ResponseEntity<>(budget, HttpStatus.OK);
    }
}