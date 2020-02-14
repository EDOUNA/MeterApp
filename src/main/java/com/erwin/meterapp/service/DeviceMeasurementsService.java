package com.erwin.meterapp.service;

import java.util.List;

import com.erwin.meterapp.model.DeviceMeasurements;
import com.erwin.meterapp.repository.DeviceMeasurementsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceMeasurementsService implements IDeviceMeasurements {

    @Autowired
    private DeviceMeasurementsRepository deviceMeasurementsRepository;

    @Override
    public List<DeviceMeasurements> findAll() {
        return (List<DeviceMeasurements>) deviceMeasurementsRepository.findAll();
    }

    @Override
    public DeviceMeasurements findById(Long id) {
        return deviceMeasurementsRepository.findById(id).orElse(new DeviceMeasurements());
    }
}