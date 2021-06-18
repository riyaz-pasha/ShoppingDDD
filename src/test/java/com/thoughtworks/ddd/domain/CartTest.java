package com.thoughtworks.ddd.domain;

import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    void addIpadProToTheCart() {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro");
        Item item = new Item(ipadPro);

        cart.addProduct(item);

        assert (cart.getItems().contains((item)));
    }

    @Test
    void addHeroInkPenToTheCart() {
        Cart cart = new Cart();
        Product heroInk = new Product("Hero Ink");
        Item item = new Item(heroInk);

        cart.addProduct(item);

        assert (cart.getItems().contains((item)));
    }

    @Test
    void addTwoGMCricketBatToTheCart() {
        Cart cart = new Cart();
        Product cricketBat = new Product("Hero Ink");
        Item cricketBats_2 = new Item(cricketBat, 2);

        cart.addProduct(cricketBats_2);

        assert (cart.getItems().contains((cricketBats_2)));
    }

}
