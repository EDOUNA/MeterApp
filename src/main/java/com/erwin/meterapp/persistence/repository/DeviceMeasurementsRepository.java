package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeviceMeasurementsRepository extends CrudRepository<DeviceMeasurementsModel, Integer> {
    List<DeviceMeasurementsModel> findAll();

    @Query("SELECT m FROM DeviceMeasurementsModel m WHERE m.deviceId = ?1 AND DATE(m.createdAt) = CURRENT_DATE ORDER BY m.id ASC")
    List<DeviceMeasurementsModel> findByDeviceIdAndCreatedToday(Integer id);

    @Query("SELECT m FROM DeviceMeasurementsModel m WHERE m.deviceId = ?1 AND DATE(m.createdAt) = CURRENT_DATE AND HOUR(m.createdAt) = HOUR(CURRENT_DATE)")
    DeviceMeasurementsModel findByCreatedTodayAndCurrentHour(Integer id);
}