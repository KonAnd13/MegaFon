package ru.itpark.model.tariffsForInternet;

import ru.itpark.model.Tariff;

public class UnlimitedForTwelveMonths extends Tariff {
    private String internet;

    public UnlimitedForTwelveMonths(String url, String name, int subscriptionFee, String territoryOfAction, String internet) {
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
