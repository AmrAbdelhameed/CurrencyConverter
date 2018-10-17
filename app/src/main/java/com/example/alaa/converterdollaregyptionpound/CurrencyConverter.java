package com.example.alaa.converterdollaregyptionpound;

public class CurrencyConverter {
    public double toUS(double doubleEgypt) {
        return doubleEgypt / 17.91;
    }

    public double toEgypt(double doubleUs) {
        return doubleUs * 17.91;
    }
}