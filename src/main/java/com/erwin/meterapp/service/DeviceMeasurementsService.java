package com.erwin.meterapp.service;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceMeasurementsService {
    private static final Logger log = LoggerFactory.getLogger(DeviceMeasurementsService.class);

    @Autowired
    DeviceMeasurementsRepository deviceMeasurementsRepository;

    @Cacheable("findByDeviceIdAndCreatedToday")
    public List<DeviceMeasurementsModel> findByDeviceIdAndCreatedToday(Integer id) {
        log.info("DeviceMeasurementService: findByDeviceIdAndCreatedToday");
        List<DeviceMeasurementsModel> deviceMeasurementsModels = deviceMeasurementsRepository.findByDeviceAndCreatedToday(id);
        return deviceMeasurementsModels;
    }

    @Cacheable("findLastMadeMeasurement")
    public DeviceMeasurementsModel findLastMadeMeasurement(Integer id) {
        log.info("DeviceMeasurementService: findLastMadeMeasurement");
        DeviceMeasurementsModel deviceMeasurementsModel = deviceMeasurementsRepository.findByOnByLastMadeMeasurement(id);
        return deviceMeasurementsModel;
    }
}