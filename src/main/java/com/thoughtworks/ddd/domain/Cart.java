package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;
    private List<Item> removedItems;

    public Cart() {
        this.items = new ArrayList<>();
        this.removedItems = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
        removedItems.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Item> getRemovedItems() {
        return removedItems;
    }
}
