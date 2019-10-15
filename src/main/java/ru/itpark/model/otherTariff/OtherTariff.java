package ru.itpark.model.otherTariff;

import ru.itpark.model.Tariff;

public abstract class OtherTariff extends Tariff {
    public OtherTariff(String url, String name, int subscriptionFee, String territoryOfAction) {
        super(url, name, subscriptionFee, territoryOfAction);
    }
}
