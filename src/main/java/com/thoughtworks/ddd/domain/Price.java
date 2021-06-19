package com.thoughtworks.ddd.domain;

import java.util.Currency;

public class Price {
    private Currency currency;
    private Float value;

    public Price(Currency currency, Float value) {
        this.currency = currency;
        this.value = value;
    }
}
