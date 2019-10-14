package ru.itpark.model.otherTariffs;

import ru.itpark.model.Tariff;

public class SmartThings extends Tariff {
    private int oneTimeSubscriptionFee;
    private int oneYearSubscriptionFee;
    private int minutes;
    private String internet;
    private int smsToRussianNumbers;

    public SmartThings(String url, String name, int subscriptionFee, String territoryOfAction, int oneTimeSubscriptionFee, int oneYearSubscriptionFee, int minutes, String internet, int smsToRussianNumbers) {
        super(url, name, subscriptionFee, territoryOfAction);
        this.oneTimeSubscriptionFee = oneTimeSubscriptionFee;
        this.oneYearSubscriptionFee = oneYearSubscriptionFee;
        this.minutes = minutes;
        this.internet = internet;
        this.smsToRussianNumbers = smsToRussianNumbers;
    }

    public int getOneTimeSubscriptionFee() {
        return oneTimeSubscriptionFee;
    }

    public void setOneTimeSubscriptionFee(int oneTimeSubscriptionFee) {
        this.oneTimeSubscriptionFee = oneTimeSubscriptionFee;
    }

    public int getOneYearSubscriptionFee() {
        return oneYearSubscriptionFee;
    }

    public void setOneYearSubscriptionFee(int oneYearSubscriptionFee) {
        this.oneYearSubscriptionFee = oneYearSubscriptionFee;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getSmsToRussianNumbers() {
        return smsToRussianNumbers;
    }

    public void setSmsToRussianNumbers(int smsToRussianNumbers) {
        this.smsToRussianNumbers = smsToRussianNumbers;
    }
}
