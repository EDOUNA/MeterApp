package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.DeviceTariffsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface DeviceTariffRepository extends CrudRepository<DeviceTariffsModel, Integer> {
    // Find a single row matching the deviceTariff ID. The end_date needs to be NULL, indicated it's still active for usage
    @Query(value = "SELECT d.* FROM device_tariffs d WHERE d.id = ?1 AND (d.end_date IS NULL OR d.end_date <= NOW())", nativeQuery = true)
    DeviceTariffsModel findActiveTariffByDeviceId(Integer id);
}