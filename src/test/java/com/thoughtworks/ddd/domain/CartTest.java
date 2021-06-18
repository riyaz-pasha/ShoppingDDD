package com.thoughtworks.ddd.domain;

import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    void addIpadProToTheCart() {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro");
        Item item = new Item(ipadPro);

        cart.addItem(item);

        assert (cart.getItems().contains((item)));
    }

    @Test
    void addHeroInkPenToTheCart() {
        Cart cart = new Cart();
        Product heroInk = new Product("Hero Ink");
        Item item = new Item(heroInk);

        cart.addItem(item);

        assert (cart.getItems().contains((item)));
    }

    @Test
    void addTwoGMCricketBatToTheCart() {
        Cart cart = new Cart();
        Product cricketBat = new Product("GM Cricket Bat");
        Item twoGMCricketBats = new Item(cricketBat, 2);

        cart.addItem(twoGMCricketBats);

        assert (cart.getItems().contains((twoGMCricketBats)));
    }

    @Test
    void removeItemFromTheCart() {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro");
        Item item = new Item(ipadPro);

        cart.addItem(item);
        cart.removeItem(item);

        assert (!cart.getItems().contains((item)));
    }

}
