package ru.itpark.model.tariffsTurnOn;

import java.util.ArrayList;

public class Look extends TurnOn {
    private int smsToRussianNumbers;

    public Look(String url, String name, int subscriptionFee, String territoryOfAction, int minutes, String internet, String callsToNumbersMegafon, String incomingCalls, ArrayList<String> giftOptions, int smsToRussianNumbers) {
        super(url, name, subscriptionFee, territoryOfAction, minutes, internet, callsToNumbersMegafon, incomingCalls, giftOptions);
        this.smsToRussianNumbers = smsToRussianNumbers;
    }

    public int getSmsToRussianNumbers() {
        return smsToRussianNumbers;
    }

    public void setSmsToRussianNumbers(int smsToRussianNumbers) {
        this.smsToRussianNumbers = smsToRussianNumbers;
    }
}
