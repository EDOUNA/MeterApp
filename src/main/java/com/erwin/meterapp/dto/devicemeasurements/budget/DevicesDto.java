package com.erwin.meterapp.dto.devicemeasurements.budget;

public class DevicesDto {
    private String description;
    private float energySpent;
    private float budgetSpent;
    private String currencySymbol;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getEnergySpent() {
        return energySpent;
    }

    public void setEnergySpent(float energySpent) {
        this.energySpent = energySpent;
    }

    public float getBudgetSpent() {
        return budgetSpent;
    }

    public void setBudgetSpent(float budgetSpent) {
        this.budgetSpent = budgetSpent;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    @Override
    public String toString() {
        return "DevicesDto{" +
                "description='" + description + '\'' +
                ", energySpent=" + energySpent +
                ", budgetSpent=" + budgetSpent +
                ", currencySymbol='" + currencySymbol + '\'' +
                '}';
    }
}