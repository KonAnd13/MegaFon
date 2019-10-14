package ru.itpark.model.otherTariffs;

import ru.itpark.model.Tariff;

public class GoToZero extends Tariff {
    private double priceForCallsToLocalMegaFonNumbers;
    private double priceForCallsToOtherLocalNumbers;
    private int priceFor100Mb;

    public GoToZero(String url, String name, int subscriptionFee, String territoryOfAction, double priceForCallsToLocalMegaFonNumbers, double priceForCallsToOtherLocalNumbers, int priceFor100Mb) {
        super(url, name, subscriptionFee, territoryOfAction);
        this.priceForCallsToLocalMegaFonNumbers = priceForCallsToLocalMegaFonNumbers;
        this.priceForCallsToOtherLocalNumbers = priceForCallsToOtherLocalNumbers;
        this.priceFor100Mb = priceFor100Mb;
    }

    public double getPriceForCallsToLocalMegaFonNumbers() {
        return priceForCallsToLocalMegaFonNumbers;
    }

    public void setPriceForCallsToLocalMegaFonNumbers(double priceForCallsToLocalMegaFonNumbers) {
        this.priceForCallsToLocalMegaFonNumbers = priceForCallsToLocalMegaFonNumbers;
    }

    public double getPriceForCallsToOtherLocalNumbers() {
        return priceForCallsToOtherLocalNumbers;
    }

    public void setPriceForCallsToOtherLocalNumbers(double priceForCallsToOtherLocalNumbers) {
        this.priceForCallsToOtherLocalNumbers = priceForCallsToOtherLocalNumbers;
    }

    public int getPriceFor100Mb() {
        return priceFor100Mb;
    }

    public void setPriceFor100Mb(int priceFor100Mb) {
        this.priceFor100Mb = priceFor100Mb;
    }
}
