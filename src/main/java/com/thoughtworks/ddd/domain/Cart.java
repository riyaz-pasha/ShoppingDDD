package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
