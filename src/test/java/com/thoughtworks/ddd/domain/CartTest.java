package com.thoughtworks.ddd.domain;

import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    void addIpadProToTheCart() {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro");
        Item item = new Item(ipadPro);

        cart.add(item);

        assert (cart.getItems().contains((item)));
    }

    @Test
    void addHeroInkPenToTheCart() {
        Cart cart = new Cart();
        Product heroInk = new Product("Hero Ink");
        Item item = new Item(heroInk);

        cart.add(item);

        assert (cart.getItems().contains((item)));
    }

    @Test
    void addTwoGMCricketBatToTheCart() {
        Cart cart = new Cart();
        Product cricketBat = new Product("GM Cricket Bat");
        Item twoGMCricketBats = new Item(cricketBat, 2);

        cart.add(twoGMCricketBats);

        assert (cart.getItems().contains((twoGMCricketBats)));
    }

    @Test
    void removeItemFromTheCart() {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro");
        Item item = new Item(ipadPro);

        cart.add(item);
        cart.remove(item);

        assert (!cart.getItems().contains((item)));
    }

    @Test
    void ShouldReturnAllRemovedItems() {
        Cart cart = new Cart();
        Item ipadItem = new Item(new Product("Ipad Pro"));
        Item twoGMCricketBatsItem = new Item(new Product("GM Cricket Bat"), 2);
        Item heroInkItem = new Item(new Product("Hero Ink"));

        cart.add(ipadItem);
        cart.add(twoGMCricketBatsItem);
        cart.add(heroInkItem);
        cart.remove(twoGMCricketBatsItem);
        cart.remove(heroInkItem);

        assert (cart.getRemovedItems().contains(twoGMCricketBatsItem));
        assert (cart.getRemovedItems().contains(heroInkItem));
    }

}
