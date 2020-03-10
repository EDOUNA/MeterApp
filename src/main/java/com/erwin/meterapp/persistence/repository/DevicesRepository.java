package com.erwin.meterapp.persistence.repository;

import com.erwin.meterapp.persistence.model.DevicesModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DevicesRepository extends CrudRepository<DevicesModel, Integer> {
    // Custom query to get it with active = 1
    @Query("SELECT d FROM DevicesModel d WHERE d.identifier = ?1 AND d.active = 1")
    DevicesModel findByIdentifierAndActive(Integer id);

    @Query("SELECT d FROM DevicesModel d WHERE d.active = 1")
    List<DevicesModel> findByActive();
}
