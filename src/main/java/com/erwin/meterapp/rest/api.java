package com.erwin.meterapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class api {

    @GetMapping("getCurrentConsumption")
    public ResponseEntity<?> getCurrentConsumption() {

        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
