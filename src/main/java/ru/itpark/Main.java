package ru.itpark;

import ru.itpark.model.otherTariffs.SmartThings;
import ru.itpark.model.tariffsForInternet.UnlimitedForSixMonths;
import ru.itpark.model.tariffsTurnOn.Write;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Write write = new Write(
                "https://tatarstan.megafon.ru/tariffs/all/pishi.html",
                "Включайся! Пиши",
                250,
                "Россия",
                300,
                "6",
                "Безлимитно",
                "Бесплатно",
                new ArrayList<>(Arrays.asList("Специи", "МегаФон ТВ", "ЛитРес", "Антивирус ESET NOD32")),
                true,
                300
        );

        UnlimitedForSixMonths unlimitedForSixMonths = new UnlimitedForSixMonths(
                "https://tatarstan.megafon.ru/tariffs/all/tvoj_bezlimit_na_6_mesyacev.html",
                "Твой безлимит на 6 месяцев",
                3100,
                "Россия",
                "Безлимитно"
        );

        SmartThings smartThings = new SmartThings(
                "https://tatarstan.megafon.ru/tariffs/all/umnye_veschi.html",
                "Умные вещи",
                20,
                "Россия",
                2500,
                750,
                10,
                "Безлимитно",
                20
        );
    }
}
