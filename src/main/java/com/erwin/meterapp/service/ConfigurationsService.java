package com.erwin.meterapp.service;

import com.erwin.meterapp.persistence.model.ConfigurationsModel;
import com.erwin.meterapp.persistence.repository.ConfigurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationsService {
    @Autowired
    private ConfigurationsRepository configurationsRepository;

    @Cacheable("findBySetting")
    public ConfigurationsModel findBySetting(String setting) {
        ConfigurationsModel configurationsModel = configurationsRepository.findBySetting(setting);
        return configurationsModel;
    }
}