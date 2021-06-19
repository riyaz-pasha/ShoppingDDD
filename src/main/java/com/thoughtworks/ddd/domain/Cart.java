package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Cart {
    private List<Item> items;
    private List<Item> removedItems;
    private UUID id;
    public boolean isCheckedOut;

    public Cart() {
        id = UUID.randomUUID();
        this.items = new ArrayList<>();
        this.removedItems = new ArrayList<>();
        this.isCheckedOut = false;
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

    public void checkout() {
        this.isCheckedOut = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        Cart cart = (Cart) o;
        return id.equals(cart.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
