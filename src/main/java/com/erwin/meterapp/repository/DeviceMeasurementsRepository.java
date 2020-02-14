package com.erwin.meterapp.repository;

import com.erwin.meterapp.model.DeviceMeasurements;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceMeasurementsRepository extends CrudRepository<DeviceMeasurements, Long> {
    
}