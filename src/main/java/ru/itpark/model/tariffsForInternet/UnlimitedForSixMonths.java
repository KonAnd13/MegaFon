package ru.itpark.model.tariffsForInternet;

import ru.itpark.model.Tariff;

public class UnlimitedForSixMonths extends Tariff {
    private String internet;

    public UnlimitedForSixMonths(String url, String name, int subscriptionFee, String territoryOfAction, String internet) {
        super(url, name, subscriptionFee, territoryOfAction);
        this.internet = internet;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}
