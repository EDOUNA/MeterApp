package com.erwin.meterapp.dto.devicemeasurements.budget;

import java.util.List;

public class BudgetDto {

    private int daysRemaining;
    private float daysPercentage;
    private float monthlyBudget;
    private float totalBudgetSpent;
    private float budgetAllowed;
    private List<DevicesDto> devices;

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

    public float getTotalBudgetSpent() {
        return totalBudgetSpent;
    }

    public void setTotalBudgetSpent(float totalBudgetSpent) {
        this.totalBudgetSpent = totalBudgetSpent;
    }

    public float getBudgetAllowed() {
        return budgetAllowed;
    }

    public void setBudgetAllowed(float budgetAllowed) {
        this.budgetAllowed = budgetAllowed;
    }

    public List<DevicesDto> getDevices() {
        return devices;
    }

    public void setDevices(List<DevicesDto> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "BudgetDto{" +
                "daysRemaining=" + daysRemaining +
                ", daysPercentage=" + daysPercentage +
                ", monthlyBudget=" + monthlyBudget +
                ", totalBudgetSpent=" + totalBudgetSpent +
                ", budgetAllowed=" + budgetAllowed +
                ", devices=" + devices +
                '}';
    }
}