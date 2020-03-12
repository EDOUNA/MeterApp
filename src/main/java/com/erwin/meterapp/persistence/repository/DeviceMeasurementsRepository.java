package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceMeasurementsRepository extends CrudRepository<DeviceMeasurementsModel, Integer> {
    List<DeviceMeasurementsModel> findAll();

    @Query("SELECT m FROM DeviceMeasurementsModel m WHERE m.device.id = ?1 AND DATE(m.createdAt) = CURRENT_DATE ORDER BY m.id ASC")
    List<DeviceMeasurementsModel> findByDeviceAndCreatedToday(Integer id);

    @Query("SELECT m FROM DeviceMeasurementsModel m WHERE m.device.id= ?1 AND DATE(m.createdAt) = CURRENT_DATE AND HOUR(m.createdAt) = HOUR(CURRENT_DATE)")
    DeviceMeasurementsModel findByCreatedTodayAndCurrentHour(Integer id);

    @Query(value = "SELECT m.* FROM device_measurements m WHERE m.device_id = ?1 ORDER BY m.created_at DESC LIMIT 1", nativeQuery = true)
    DeviceMeasurementsModel findByOnByLastMadeMeasurement(Integer id);
}