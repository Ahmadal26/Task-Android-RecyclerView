package com.example.androidrecyclerview;

public class Currency {

    private String currencyCode;
    private String currencyName;
    private double exchangeRate;

    private int countryFlag;

    public Currency(String currencyCode, String currencyName, double exchangeRate, int countryFlag) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.countryFlag = countryFlag;
    }
    public String getCurrencyCode() {

        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {

        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {

        return currencyName;
    }

    public void setCurrencyName(String currencyName) {

        this.currencyName = currencyName;
    }

    public double getExchangeRate() {

        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {

        this.exchangeRate = exchangeRate;
    }

    public int getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(int countryFlag) {
        this.countryFlag = countryFlag;
    }
}
