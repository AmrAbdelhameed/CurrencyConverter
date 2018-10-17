package com.example.alaa.converterdollaregyptionpound;

public class CurrencyConverter {
    public double toUS(String strEgypt) {
        return Double.parseDouble(strEgypt) / 17.91;
    }

    public double toEgypt(String strUs) {
        return Double.parseDouble(strUs) * 17.91;
    }
}
