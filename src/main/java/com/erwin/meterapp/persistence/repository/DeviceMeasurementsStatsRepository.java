package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsStatsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface DeviceMeasurementsStatsRepository extends CrudRepository<DeviceMeasurementsStatsModel, Integer> {

    @Query("SELECT s FROM DeviceMeasurementsStatsModel s WHERE s.device.id = ?1 AND s.tariff.id = ?2 AND s.hour = ?3 AND DATE(s.createdAt) = CURRENT_DATE")
    DeviceMeasurementsStatsModel findByDeviceAndTariffAndHour(Integer deviceId, Integer tariffId, Integer hour);
}