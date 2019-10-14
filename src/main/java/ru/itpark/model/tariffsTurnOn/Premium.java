package ru.itpark.model.tariffsTurnOn;

import java.util.ArrayList;

public class Premium extends TurnOn {
    private String smsToRussianNumbers;
    private int smsToOtherRussianNumbers;

    public Premium(String url, String name, int subscriptionFee, String territoryOfAction, int minutes, String internet, String callsToNumbersMegafon, String incomingCalls, ArrayList<String> giftOptions, String smsToRussianNumbers, int smsToOtherRussianNumbers) {
        super(url, name, subscriptionFee, territoryOfAction, minutes, internet, callsToNumbersMegafon, incomingCalls, giftOptions);
        this.smsToRussianNumbers = smsToRussianNumbers;
        this.smsToOtherRussianNumbers = smsToOtherRussianNumbers;
    }

    public String getSmsToRussianNumbers() {
        return smsToRussianNumbers;
    }

    public void setSmsToRussianNumbers(String smsToRussianNumbers) {
        this.smsToRussianNumbers = smsToRussianNumbers;
    }

    public int getSmsToOtherRussianNumbers() {
        return smsToOtherRussianNumbers;
    }

    public void setSmsToOtherRussianNumbers(int smsToOtherRussianNumbers) {
        this.smsToOtherRussianNumbers = smsToOtherRussianNumbers;
    }
}
