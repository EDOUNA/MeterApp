package com.erwin.meterapp.dto.devicemeasurements;

import com.erwin.meterapp.persistence.model.DevicesModel;

public class BudgetDto {

    /**
     * OLD PHP EXAMPLE DATA
     * $msg['daysRemaining'] = ($daysInMonth - $currentDay);
     * $msg['daysPercentage'] = round(100 - ($msg['daysRemaining'] / $daysInMonth) * 100);
     * $msg['monthlyBudget'] = round($monthlyBudgetConfiguration, 2);
     * $msg['budgetAllowed'] = round($budgetPerDay, 2);
     * $msg['budgetSpent'] = 0;
     * $msg['budgetCurrency'] = null;
     */
    private int daysRemaining;
    private float daysPercentage;
    private float monthlyBudget;
    private float budgetSpent;
    private String budgetCurrency;
    private DevicesModel devices;

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

    public DevicesModel getDevices() {
        return devices;
    }

    public void setDevices(DevicesModel devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "BudgetDto{" +
                "daysRemaining=" + daysRemaining +
                ", daysPercentage=" + daysPercentage +
                ", monthlyBudget=" + monthlyBudget +
                ", budgetSpent=" + budgetSpent +
                ", budgetCurrency='" + budgetCurrency + '\'' +
                ", devices=" + devices +
                '}';
    }
}