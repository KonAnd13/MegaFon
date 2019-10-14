package ru.itpark.model.otherTariffs;

import ru.itpark.model.Tariff;

public class Hello extends Tariff {
    private String callsToNumbersMegafon;
    private int minutes;
    private String incomingCalls;
    private boolean unlimitedInternetForMessengers;
    private boolean unlimitedInternetForSocialNetworks;
    private String internet;

    public Hello(String url, String name, int subscriptionFee, String territoryOfAction, String callsToNumbersMegafon, int minutes, String incomingCalls, boolean unlimitedInternetForMessengers, boolean unlimitedInternetForSocialNetworks, String internet) {
        super(url, name, subscriptionFee, territoryOfAction);
        this.callsToNumbersMegafon = callsToNumbersMegafon;
        this.minutes = minutes;
        this.incomingCalls = incomingCalls;
        this.unlimitedInternetForMessengers = unlimitedInternetForMessengers;
        this.unlimitedInternetForSocialNetworks = unlimitedInternetForSocialNetworks;
        this.internet = internet;
    }

    public String getCallsToNumbersMegafon() {
        return callsToNumbersMegafon;
    }

    public void setCallsToNumbersMegafon(String callsToNumbersMegafon) {
        this.callsToNumbersMegafon = callsToNumbersMegafon;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getIncomingCalls() {
        return incomingCalls;
    }

    public void setIncomingCalls(String incomingCalls) {
        this.incomingCalls = incomingCalls;
    }

    public boolean isUnlimitedInternetForMessengers() {
        return unlimitedInternetForMessengers;
    }

    public void setUnlimitedInternetForMessengers(boolean unlimitedInternetForMessengers) {
        this.unlimitedInternetForMessengers = unlimitedInternetForMessengers;
    }

    public boolean isUnlimitedInternetForSocialNetworks() {
        return unlimitedInternetForSocialNetworks;
    }

    public void setUnlimitedInternetForSocialNetworks(boolean unlimitedInternetForSocialNetworks) {
        this.unlimitedInternetForSocialNetworks = unlimitedInternetForSocialNetworks;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}
