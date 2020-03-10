package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeviceMeasurementsRepository extends CrudRepository<DeviceMeasurementsModel, Long> {
    List<DeviceMeasurementsModel> findAll();

    DeviceMeasurementsModel findById(long id);
}