package ru.itpark.model;

public abstract class Tariff {
    private String url;
    private String name;
    private int subscriptionFee;
    private String territoryOfAction;

    public Tariff(String url, String name, int subscriptionFee, String territoryOfAction) {
        this.url = url;
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.territoryOfAction = territoryOfAction;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public String getTerritoryOfAction() {
        return territoryOfAction;
    }

    public void setTerritoryOfAction(String territoryOfAction) {
        this.territoryOfAction = territoryOfAction;
    }
}
