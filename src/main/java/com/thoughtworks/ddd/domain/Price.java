package com.thoughtworks.ddd.domain;

import java.util.Currency;

public class Price {
    private Currency currency;
    private Float value;

    public Price(Float value) {
        this.currency = Currency.getInstance("INR");
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Price{" +
                "currency=" + currency +
                ", value=" + value +
                '}';
    }
}
