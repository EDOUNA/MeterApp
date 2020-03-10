package com.erwin.meterapp.persistence.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "devices")
public class DevicesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(name = "description")
    private String descritpion;

    @Column(name = "identifier")
    private int identifier;

    @Column(name = "device_type_id")
    private int deviceTypeId;

    @OneToOne
    @JoinColumn(name = "tariff_id", referencedColumnName = "id")
    private DeviceTariffsModel tariffsModel;

    @Column(name = "active")
    private int active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(int deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public DeviceTariffsModel getTariffsModel() {
        return tariffsModel;
    }

    public void setTariffsModel(DeviceTariffsModel tariffsModel) {
        this.tariffsModel = tariffsModel;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "DevicesModel{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", descritpion='" + descritpion + '\'' +
                ", identifier=" + identifier +
                ", deviceTypeId=" + deviceTypeId +
                ", tariffsModel=" + tariffsModel +
                ", active=" + active +
                '}';
    }
}