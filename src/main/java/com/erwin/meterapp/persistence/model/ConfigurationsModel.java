package com.erwin.meterapp.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "configuration")
public class ConfigurationsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(name = "setting")
    private String setting;

    @Column(name = "parameter")
    private String parameter;

    public ConfigurationsModel() {
    }

    public ConfigurationsModel(long id, Timestamp createdAt, Timestamp updatedAt, String setting, String parameter) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.setting = setting;
        this.parameter = parameter;
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

    public String getSetting() {
        return this.setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getParameter() {
        return this.parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public ConfigurationsModel id(long id) {
        this.id = id;
        return this;
    }

    public ConfigurationsModel createdAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ConfigurationsModel updatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public ConfigurationsModel setting(String setting) {
        this.setting = setting;
        return this;
    }

    public ConfigurationsModel parameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ConfigurationsModel)) {
            return false;
        }
        ConfigurationsModel configurationsModel = (ConfigurationsModel) o;
        return id == configurationsModel.id && Objects.equals(createdAt, configurationsModel.createdAt)
                && Objects.equals(updatedAt, configurationsModel.updatedAt)
                && Objects.equals(setting, configurationsModel.setting)
                && Objects.equals(parameter, configurationsModel.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, updatedAt, setting, parameter);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", createdAt='" + getCreatedAt() + "'" + ", updatedAt='" + getUpdatedAt()
                + "'" + ", setting='" + getSetting() + "'" + ", parameter='" + getParameter() + "'" + "}";
    }

}