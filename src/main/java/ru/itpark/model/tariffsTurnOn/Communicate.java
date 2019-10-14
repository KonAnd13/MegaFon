package ru.itpark.model.tariffsTurnOn;

import java.util.ArrayList;

public class Communicate extends TurnOn {

    public Communicate(String url, String name, int subscriptionFee, String territoryOfAction, int minutes, String internet, String callsToNumbersMegafon, String incomingCalls, ArrayList<String> giftOptions) {
        super(url, name, subscriptionFee, territoryOfAction, minutes, internet, callsToNumbersMegafon, incomingCalls, giftOptions);
    }
}
