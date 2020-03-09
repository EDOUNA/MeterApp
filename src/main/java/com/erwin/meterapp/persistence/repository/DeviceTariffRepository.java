package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.DeviceTariffsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DeviceTariffRepository extends CrudRepository<DeviceTariffsModel, Integer> {
    @Query("SELECT t FROM DevicesTariffModel t WHERE t.id = ?1 AND t.end_date IS NULL")
    DeviceTariffsModel findActiveTariffByDeviceId(Integer id);
}
