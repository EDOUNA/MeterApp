package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.ConfigurationsModel;

import org.springframework.data.repository.CrudRepository;

public interface ConfigurationsRepository extends CrudRepository<ConfigurationsModel, Long> {
    ConfigurationsModel findByid(long id);

    ConfigurationsModel findBySetting(String setting);
}