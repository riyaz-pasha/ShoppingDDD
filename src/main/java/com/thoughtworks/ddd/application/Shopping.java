package com.thoughtworks.ddd.application;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Item;
import com.thoughtworks.ddd.domain.Product;

public class Shopping {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Item ipadPro = new Item(new Product("Ipad Pro"), 1);
        cart.addProduct(ipadPro);
    }
}
