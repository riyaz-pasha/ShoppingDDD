package com.thoughtworks.ddd.domain;

import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    void addIpadProToTheCart() {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro");
        Item ipadPro_1 = new Item(ipadPro, 1);

        cart.addProduct(ipadPro_1);

        assert (cart.getItems().contains((ipadPro_1)));
    }

    @Test
    void addHeroInkPenToTheCart() {
        Cart cart = new Cart();
        Product heroInk = new Product("Hero Ink");
        Item heroInk_1 = new Item(heroInk, 2);

        cart.addProduct(heroInk_1);

        assert (cart.getItems().contains((heroInk_1)));
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
