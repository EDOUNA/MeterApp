package com.erwin.meterapp.service;

import com.erwin.meterapp.persistence.model.DevicesModel;
import com.erwin.meterapp.persistence.repository.DevicesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevicesService {
    private static final Logger log = LoggerFactory.getLogger(DevicesService.class);

    @Autowired
    private DevicesRepository devicesRepository;

    @Cacheable("findByIdentifierAndActive")
    public DevicesModel findByIdentifierAndActive(Integer id) {
        DevicesModel devicesModel = devicesRepository.findByIdentifierAndActive(id);
        return devicesModel;
    }

    @Cacheable("findByActive")
    public List<DevicesModel> findByActive() {
        List<DevicesModel> devicesModels = devicesRepository.findByActive();
        return devicesModels;
    }

    @Cacheable("findById")
    public DevicesModel findById(Integer id) {
        DevicesModel device = devicesRepository.findById(id).orElse(null);
        return device;
    }
}