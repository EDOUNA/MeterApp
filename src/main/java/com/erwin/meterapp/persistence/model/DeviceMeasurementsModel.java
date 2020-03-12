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

    @OneToOne
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    private DevicesModel device;

    @OneToOne()
    @JoinColumn(name = "tariff_id", referencedColumnName = "id")
    private DeviceTariffsModel tariff;

    @Column(name = "amount")
    private float amount;

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

    public DevicesModel getDevice() {
        return device;
    }

    public void setDevice(DevicesModel device) {
        this.device = device;
    }

    public DeviceTariffsModel getTariff() {
        return tariff;
    }

    public void setDeviceTariffs(DeviceTariffsModel tariff) {
        this.tariff = tariff;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DeviceMeasurementsModel{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", device=" + device +
                ", tariff=" + tariff +
                ", amount=" + amount +
                '}';
    }
}