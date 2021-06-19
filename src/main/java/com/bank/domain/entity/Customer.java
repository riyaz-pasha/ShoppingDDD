package com.bank.domain.entity;

import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;
    public Address address;

    public Customer(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
