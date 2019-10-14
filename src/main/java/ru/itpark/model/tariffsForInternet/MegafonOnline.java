package ru.itpark.model.tariffsForInternet;

import ru.itpark.model.Tariff;

public class MegafonOnline extends Tariff {
    private int priceForOneMb;

    public MegafonOnline(String url, String name, int subscriptionFee, String territoryOfAction, int priceForOneMb) {
        super(url, name, subscriptionFee, territoryOfAction);
        this.priceForOneMb = priceForOneMb;
    }

    public int getPriceForOneMb() {
        return priceForOneMb;
    }

    public void setPriceForOneMb(int priceForOneMb) {
        this.priceForOneMb = priceForOneMb;
    }
}
