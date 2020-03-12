package com.erwin.meterapp.dto.devicemeasurements;

import com.erwin.meterapp.persistence.model.DevicesModel;

public class BudgetDto {

    private int daysRemaining;
    private float daysPercentage;
    private float monthlyBudget;
    private float budgetSpent;
    private float budgetAllowed;
    private String budgetCurrency;
    private float deviceTariff;
    private DevicesModel device;

    public int getDaysRemaining() {
        return daysRemaining;
    }

    public void setDaysRemaining(int daysRemaining) {
        this.daysRemaining = daysRemaining;
    }

    public float getDaysPercentage() {
        return daysPercentage;
    }

    public void setDaysPercentage(float daysPercentage) {
        this.daysPercentage = daysPercentage;
    }

    public float getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(float monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public float getBudgetSpent() {
        return budgetSpent;
    }

    public void setBudgetSpent(float budgetSpent) {
        this.budgetSpent = budgetSpent;
    }

    public String getBudgetCurrency() {
        return budgetCurrency;
    }

    public void setBudgetCurrency(String budgetCurrency) {
        this.budgetCurrency = budgetCurrency;
    }

    public DevicesModel getDevice() {
        return device;
    }

    public void setDevice(DevicesModel device) {
        this.device = device;
    }

    public float getBudgetAllowed() {
        return budgetAllowed;
    }

    public void setBudgetAllowed(float budgetAllowed) {
        this.budgetAllowed = budgetAllowed;
    }

    public float getDeviceTariff() {
        return deviceTariff;
    }

    public void setDeviceTariff(float deviceTariff) {
        this.deviceTariff = deviceTariff;
    }

    @Override
    public String toString() {
        return "BudgetDto{" +
                "daysRemaining=" + daysRemaining +
                ", daysPercentage=" + daysPercentage +
                ", monthlyBudget=" + monthlyBudget +
                ", budgetSpent=" + budgetSpent +
                ", budgetAllowed=" + budgetAllowed +
                ", budgetCurrency='" + budgetCurrency + '\'' +
                ", device=" + device +
                ", deviceTariff=" + deviceTariff +
                '}';
    }
}