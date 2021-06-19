package com.bank.domain.events;

import com.bank.domain.entity.Address;
import com.bank.domain.entity.Customer;

public class CustomerAddressUpdated {
    private Customer customer;

    public CustomerAddressUpdated(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
