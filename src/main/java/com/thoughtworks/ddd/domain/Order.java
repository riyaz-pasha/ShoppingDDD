package com.thoughtworks.ddd.domain;

import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private List<Item> items;

    public Order(List<Item> items) {
        this.id = UUID.randomUUID();
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}
