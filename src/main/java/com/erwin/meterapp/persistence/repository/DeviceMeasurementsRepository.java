package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceMeasurementsRepository extends CrudRepository<DeviceMeasurementsModel, Long> {
    List<DeviceMeasurementsModel> findAll();
    DeviceMeasurementsModel findById(long id);
}