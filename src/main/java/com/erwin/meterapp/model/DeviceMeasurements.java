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

    public DeviceMeasurements() {
    }

    public DeviceMeasurements(long id, Timestamp createdAt, Timestamp updatedAt, int deviceId, int tariffId, float amount, int active, String json) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deviceId = deviceId;
        this.tariffId = tariffId;
        this.amount = amount;
        this.active = active;
        this.json = json;
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

    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getJson() {
        return this.json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public DeviceMeasurements id(long id) {
        this.id = id;
        return this;
    }

    public DeviceMeasurements createdAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public DeviceMeasurements updatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public DeviceMeasurements deviceId(int deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public DeviceMeasurements tariffId(int tariffId) {
        this.tariffId = tariffId;
        return this;
    }

    public DeviceMeasurements amount(float amount) {
        this.amount = amount;
        return this;
    }

    public DeviceMeasurements active(int active) {
        this.active = active;
        return this;
    }

    public DeviceMeasurements json(String json) {
        this.json = json;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DeviceMeasurements)) {
            return false;
        }
        DeviceMeasurements deviceMeasurements = (DeviceMeasurements) o;
        return id == deviceMeasurements.id && Objects.equals(createdAt, deviceMeasurements.createdAt) && Objects.equals(updatedAt, deviceMeasurements.updatedAt) && deviceId == deviceMeasurements.deviceId && tariffId == deviceMeasurements.tariffId && amount == deviceMeasurements.amount && active == deviceMeasurements.active && Objects.equals(json, deviceMeasurements.json);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, updatedAt, deviceId, tariffId, amount, active, json);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", deviceId='" + getDeviceId() + "'" +
            ", tariffId='" + getTariffId() + "'" +
            ", amount='" + getAmount() + "'" +
            ", active='" + getActive() + "'" +
            ", json='" + getJson() + "'" +
            "}";
    }

    @Column
    private int active;

    @Column(name = "json_serialize")
    private String json;

    public long getId() {
        return this.id;
    }

}