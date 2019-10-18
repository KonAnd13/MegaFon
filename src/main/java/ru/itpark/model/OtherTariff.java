package ru.itpark.model;

public abstract class OtherTariff extends Tariff {
    public OtherTariff(String id, String url, String name, int subscriptionFee, String territoryOfAction) {
        super(id, url, name, subscriptionFee, territoryOfAction);
    }
}
