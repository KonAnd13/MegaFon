package ru.itpark.model;

public abstract class Internet extends Tariff {
    private String internet;

    public Internet(String id, String url, String name, int subscriptionFee, String territoryOfAction, String internet) {
        super(id, url, name, subscriptionFee, territoryOfAction);
        this.internet = internet;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}
