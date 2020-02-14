package com.erwin.meterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MeterApp {

	public static void main(String[] args) {
		SpringApplication.run(MeterApp.class, args);
	}

}