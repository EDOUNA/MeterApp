package com.erwin.meterapp.persistence.repository;

import java.util.List;
import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import org.springframework.data.repository.CrudRepository;

public interface DeviceMeasurementsRepository extends CrudRepository<DeviceMeasurementsModel, Long> {

    List<DeviceMeasurementsModel> findAll();

    List<DeviceMeasurementsModel> findById(long id);
}