package ru.itpark.model.otherTariffs;

import ru.itpark.model.Tariff;

public class PerSecond extends Tariff {
    private double costForCallsToNumbersInTheHomeRegion;

    public PerSecond(String url, String name, int subscriptionFee, String territoryOfAction, double costForCallsToNumbersInTheHomeRegion) {
        super(url, name, subscriptionFee, territoryOfAction);
        this.costForCallsToNumbersInTheHomeRegion = costForCallsToNumbersInTheHomeRegion;
    }

    public double getCostForCallsToNumbersInTheHomeRegion() {
        return costForCallsToNumbersInTheHomeRegion;
    }

    public void setCostForCallsToNumbersInTheHomeRegion(double costForCallsToNumbersInTheHomeRegion) {
        this.costForCallsToNumbersInTheHomeRegion = costForCallsToNumbersInTheHomeRegion;
    }
}
