package com.thoughtworks.ddd.domain;

import java.util.Currency;

public class Product {
    private String name;
    private Price price;

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }
}
