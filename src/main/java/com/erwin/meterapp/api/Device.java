package com.erwin.meterapp.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;

@Controller
public class Device {

    private static final Logger log = LoggerFactory.getLogger(Device.class);

    /**
     * Main constructor
     */
    public Device() {
        log.debug("Starting!");
    }
}