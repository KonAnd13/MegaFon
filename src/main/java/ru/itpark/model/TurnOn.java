package ru.itpark.model;

import java.util.List;

public abstract class TurnOn extends Tariff {
    private int minutes;
    private String internet;
    private String callsToNumbersMegafon;
    private String incomingCalls;
    private List<String> giftOptions;

    public TurnOn(String id, String url, String name, int subscriptionFee, String territoryOfAction, int minutes, String internet, String callsToNumbersMegafon, String incomingCalls, List<String> giftOptions) {
        super(id, url, name, subscriptionFee, territoryOfAction);
        this.minutes = minutes;
        this.internet = internet;
        this.callsToNumbersMegafon = callsToNumbersMegafon;
        this.incomingCalls = incomingCalls;
        this.giftOptions = giftOptions;
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

    public String getCallsToNumbersMegafon() {
        return callsToNumbersMegafon;
    }

    public void setCallsToNumbersMegafon(String callsToNumbersMegafon) {
        this.callsToNumbersMegafon = callsToNumbersMegafon;
    }

    public String getIncomingCalls() {
        return incomingCalls;
    }

    public void setIncomingCalls(String incomingCalls) {
        this.incomingCalls = incomingCalls;
    }

    public List<String> getGiftOptions() {
        return giftOptions;
    }

    public void setGiftOptions(List<String> giftOptions) {
        this.giftOptions = giftOptions;
    }
}
