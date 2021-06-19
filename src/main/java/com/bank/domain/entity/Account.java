package com.bank.domain.entity;

import java.util.UUID;

public class Account {

    private final UUID id;
    public Address address;
    public UUID customerId;

    public Account(UUID customerId) {
        this.customerId = customerId;
        this.id = UUID.randomUUID();
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
    }

}
