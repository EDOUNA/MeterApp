package com.erwin.meterapp.persistence.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "device_measurements")
public class DeviceMeasurementsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(name = "device_id")
    private int deviceId;

    @OneToOne()
    @JoinColumn(name = "tariff_id", referencedColumnName = "id")
    private DeviceTariffsModel deviceTariffs;

    @Column(name = "amount")
    private float amount;

    @Column(name = "json_serialize")
    private String jsonSerialize;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public DeviceTariffsModel getDeviceTariffs() {
        return deviceTariffs;
    }

    public void setDeviceTariffs(DeviceTariffsModel deviceTariffs) {
        this.deviceTariffs = deviceTariffs;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getJsonSerialize() {
        return jsonSerialize;
    }

    public void setJsonSerialize(String jsonSerialize) {
        this.jsonSerialize = jsonSerialize;
    }

    @Override
    public String toString() {
        return "DeviceMeasurementsModel{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deviceId=" + deviceId +
                ", deviceTariffs=" + deviceTariffs +
                ", amount=" + amount +
                ", jsonSerialize='" + jsonSerialize + '\'' +
                '}';
    }
}