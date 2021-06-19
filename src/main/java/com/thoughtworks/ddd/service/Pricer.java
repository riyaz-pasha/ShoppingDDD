package com.thoughtworks.ddd.service;

import com.thoughtworks.ddd.domain.Price;

import java.util.Currency;
import java.util.HashMap;

public class Pricer {
    private static HashMap<String, Price> prices = new HashMap<>();

    static {
        initPrices();
    }

    public static HashMap<String, Price> initPrices() {
        prices.put("Ipad Pro", new Price(Currency.getInstance("INR"), 100F));
        prices.put("Hero Ink", new Price(Currency.getInstance("INR"), 100F));
        return prices;
    }

    public static Price getDiscountedPrice(String productName) {
        Price competitorPrice = prices.get(productName);
        return new Price(competitorPrice.getCurrency(), competitorPrice.getValue() * 0.9F);
    }

}
