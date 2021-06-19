package com.bank.domain.service;

import com.bank.domain.entity.Account;
import com.bank.domain.entity.Address;
import com.bank.domain.entity.Customer;
import org.junit.jupiter.api.Test;

public class CustomerServiceTest {

    @Test
    void ShouldUpdateCustomerAddress() {
        Address address = new Address("105", "Nehru st", "Hyderabad", "536978");
        Customer customer = CustomerService.createCustomer("Riyaz");
        Account account = AccountService.createAccount(customer.getId());

        CustomerService.updateAddress(customer.getId(), address);

        assert (account.address.equals(address));
    }
}
