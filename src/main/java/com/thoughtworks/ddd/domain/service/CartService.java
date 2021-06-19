package com.thoughtworks.ddd.domain.service;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Order;

public class CartService {

    public CartService() {
    }

    public Order checkout(Cart cart) {
        Order order = new Order(cart.getItems());
        cart.checkout();    
        return order;
    }
}
