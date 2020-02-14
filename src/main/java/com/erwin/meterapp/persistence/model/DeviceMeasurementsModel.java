package com.erwin.meterapp.persistence.model;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "device_measurements_copy")
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

    @Column(name = "tariff_id")
    private int tariffId;

    private float amount;

    public DeviceMeasurementsModel() {
    }

    public DeviceMeasurementsModel(long id, Timestamp createdAt, Timestamp updatedAt, int deviceId, int tariffId,
            float amount) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deviceId = deviceId;
        this.tariffId = tariffId;
        this.amount = amount;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getTariffId() {
        return this.tariffId;
    }

    public void setTariffId(int tariffId) {
        this.tariffId = tariffId;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public DeviceMeasurementsModel id(long id) {
        this.id = id;
        return this;
    }

    public DeviceMeasurementsModel createdAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public DeviceMeasurementsModel updatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public DeviceMeasurementsModel deviceId(int deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public DeviceMeasurementsModel tariffId(int tariffId) {
        this.tariffId = tariffId;
        return this;
    }

    public DeviceMeasurementsModel amount(float amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DeviceMeasurementsModel)) {
            return false;
        }
        DeviceMeasurementsModel deviceMeasurementsModel = (DeviceMeasurementsModel) o;
        return id == deviceMeasurementsModel.id && Objects.equals(createdAt, deviceMeasurementsModel.createdAt)
                && Objects.equals(updatedAt, deviceMeasurementsModel.updatedAt)
                && deviceId == deviceMeasurementsModel.deviceId && tariffId == deviceMeasurementsModel.tariffId
                && amount == deviceMeasurementsModel.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, updatedAt, deviceId, tariffId, amount);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", createdAt='" + getCreatedAt() + "'" + ", updatedAt='" + getUpdatedAt()
                + "'" + ", deviceId='" + getDeviceId() + "'" + ", tariffId='" + getTariffId() + "'" + ", amount='"
                + getAmount() + "'" + "}";
    }
}