package ru.itpark.model.otherTariffs;

import ru.itpark.model.tariffsTurnOn.TurnOn;
import java.util.ArrayList;

public class WarmWelcomePromotion extends TurnOn {

    public WarmWelcomePromotion(String url, String name, int subscriptionFee, String territoryOfAction, int minutes, String internet, String callsToNumbersMegafon, String incomingCalls, ArrayList<String> giftOptions) {
        super(url, name, subscriptionFee, territoryOfAction, minutes, internet, callsToNumbersMegafon, incomingCalls, giftOptions);
    }
}
