package com.bank.domain.entity;

public class Address {
    private String doorNumber;
    private String street;
    private String city;
    private String pinCode;

    public Address(String doorNumber, String street, String city, String pinCode) {
        this.doorNumber = doorNumber;
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
    }
}
