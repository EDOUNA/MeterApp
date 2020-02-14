package com.erwin.meterapp.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_measurements_copy")
public class DeviceMeasurements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "device_id")
    private int deviceId;

    @Column(name = "tariff_id")
    private int tariffId;

    @Column
    private float amount;

    @Column
    private int active;

    @Column(name = "json_serialize")
    private String json;

    public long getId() {
        return this.id;
    }

}