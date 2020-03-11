package com.erwin.meterapp.rest;

import com.erwin.meterapp.controller.DeviceMeasurementsStats;
import com.erwin.meterapp.dto.devicemeasurements.BudgetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class api {
    @Autowired
    DeviceMeasurementsStats deviceMeasurementsStats;

    @GetMapping("getCurrentConsumption")
    public ResponseEntity<?> getCurrentConsumption(Enum rangeType) {

        BudgetDto getBudget = deviceMeasurementsStats.getBudget(rangeType);
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
