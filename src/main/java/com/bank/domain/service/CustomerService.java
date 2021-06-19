package com.bank.domain.service;

import com.bank.domain.entity.Address;
import com.bank.domain.entity.Customer;
import com.bank.domain.events.CustomerAddressUpdated;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerService {
    private static List<Customer> customers = new ArrayList<>();

    public static Customer createCustomer(String name) {
        Customer customer = new Customer(name);
        customers.add(customer);
        return customer;
    }

    public static void updateAddress(UUID customerId, Address address) {
        for (Customer customer : customers) {
            if (customer.getId().equals(customerId)) {
                customer.updateAddress(address);
                CustomerAddressUpdated event = new CustomerAddressUpdated(customer);
                apply(event);
            }
        }
    }

    public static void apply(CustomerAddressUpdated event) {
        AccountService.updateAddress(event.getCustomer().getId(), event.getCustomer().getAddress());
    }
}
