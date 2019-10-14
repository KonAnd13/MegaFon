package ru.itpark.model.tariffsTurnOn;

import java.util.ArrayList;

public class Write extends TurnOn {
    private boolean unlimitedInternetForMessengers;
    private int smsToRussianNumbers;

    public Write(String url, String name, int subscriptionFee, String territoryOfAction, int minutes, String internet, String callsToNumbersMegafon, String incomingCalls, ArrayList<String> giftOptions, boolean unlimitedInternetForMessengers, int smsToRussianNumbers) {
        super(url, name, subscriptionFee, territoryOfAction, minutes, internet, callsToNumbersMegafon, incomingCalls, giftOptions);
        this.unlimitedInternetForMessengers = unlimitedInternetForMessengers;
        this.smsToRussianNumbers = smsToRussianNumbers;
    }

    public boolean isUnlimitedInternetForMessengers() {
        return unlimitedInternetForMessengers;
    }

    public void setUnlimitedInternetForMessengers(boolean unlimitedInternetForMessengers) {
        this.unlimitedInternetForMessengers = unlimitedInternetForMessengers;
    }

    public int getSmsToRussianNumbers() {
        return smsToRussianNumbers;
    }

    public void setSmsToRussianNumbers(int smsToRussianNumbers) {
        this.smsToRussianNumbers = smsToRussianNumbers;
    }
}
