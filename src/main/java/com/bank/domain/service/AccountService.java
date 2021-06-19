package com.bank.domain.service;

import com.bank.domain.entity.Account;
import com.bank.domain.entity.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AccountService {

    private static List<Account> accounts = new ArrayList<>();

    public static Account createAccount(UUID customerId) {
        Account account = new Account(customerId);
        accounts.add(account);
        return account;
    }

    public static void updateAddress(UUID customerId, Address address) {
        for (Account account : accounts) {
            if (account.customerId.equals(customerId)) {
                account.updateAddress(address);
            }
        }
    }
}
