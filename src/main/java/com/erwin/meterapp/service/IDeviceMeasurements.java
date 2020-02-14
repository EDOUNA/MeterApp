package com.erwin.meterapp.service;

import com.erwin.meterapp.model.DeviceMeasurements;
import java.util.List;

public interface IDeviceMeasurements {

    List<DeviceMeasurements> findAll();

    DeviceMeasurements findById(Long id);
}