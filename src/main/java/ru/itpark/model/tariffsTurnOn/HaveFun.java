package ru.itpark.model.tariffsTurnOn;

import java.util.ArrayList;

public class HaveFun extends TurnOn {
    private boolean unlimitedInternetForPopularServices;

    public HaveFun(String url, String name, int subscriptionFee, String territoryOfAction, int minutes, String internet, String callsToNumbersMegafon, String incomingCalls, ArrayList<String> giftOptions, boolean unlimitedInternetForPopularServices) {
        super(url, name, subscriptionFee, territoryOfAction, minutes, internet, callsToNumbersMegafon, incomingCalls, giftOptions);
        this.unlimitedInternetForPopularServices = unlimitedInternetForPopularServices;
    }

    public boolean isUnlimitedInternetForPopularServices() {
        return unlimitedInternetForPopularServices;
    }

    public void setUnlimitedInternetForPopularServices(boolean unlimitedInternetForPopularServices) {
        this.unlimitedInternetForPopularServices = unlimitedInternetForPopularServices;
    }
}
