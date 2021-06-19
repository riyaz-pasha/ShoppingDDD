package com.thoughtworks.ddd.domain;

import com.thoughtworks.ddd.domain.service.Pricer;
import org.junit.jupiter.api.Test;

import java.util.Currency;

public class CartTest {

    @Test
    void ShouldAddIpadProToTheCart() {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro", new Price(Currency.getInstance("INR"), 100.00F));
        Item item = new Item(ipadPro);

        cart.add(item);

        assert (cart.getItems().contains((item)));
    }

    @Test
    void ShouldAddHeroInkPenToTheCart() {
        Cart cart = new Cart();
        Product heroInk = new Product("Hero Ink", new Price(Currency.getInstance("INR"), 100.00F));
        Item item = new Item(heroInk);

        cart.add(item);

        assert (cart.getItems().contains((item)));
    }

    @Test
    void ShouldAddTwoGMCricketBatToTheCart() {
        Cart cart = new Cart();
        Product cricketBat = new Product("GM Cricket Bat", new Price(Currency.getInstance("INR"), 100.00F));
        Item twoGMCricketBats = new Item(cricketBat, 2);

        cart.add(twoGMCricketBats);

        assert (cart.getItems().contains((twoGMCricketBats)));
    }

    @Test
    void ShouldRemoveItemFromTheCart() {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro", new Price(Currency.getInstance("INR"), 100.00F));
        Item item = new Item(ipadPro);

        cart.add(item);
        cart.remove(item);

        assert (!cart.getItems().contains((item)));
    }

    @Test
    void ShouldReturnAllRemovedItems() {
        Cart cart = new Cart();
        Item ipadItem = new Item(new Product("Ipad Pro", new Price(Currency.getInstance("INR"), 100.00F)));
        Item twoGMCricketBatsItem = new Item(new Product("GM Cricket Bat", new Price(Currency.getInstance("INR"), 100.00F)), 2);
        Item heroInkItem = new Item(new Product("Hero Ink", new Price(Currency.getInstance("INR"), 100.00F)));

        cart.add(ipadItem);
        cart.add(twoGMCricketBatsItem);
        cart.add(heroInkItem);
        cart.remove(twoGMCricketBatsItem);
        cart.remove(heroInkItem);

        assert (cart.getRemovedItems().contains(twoGMCricketBatsItem));
        assert (cart.getRemovedItems().contains(heroInkItem));
    }

    @Test
    void ShouldDifferentiateBetweenTwoCarts() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Item item1 = new Item(new Product("Ipad", new Price(Currency.getInstance("INR"), 100.00F)), 1);
        Item item2 = new Item(new Product("Ipad", new Price(Currency.getInstance("INR"), 100.00F)), 1);

        cart1.add(item1);
        cart2.add(item2);

        assert (!cart1.equals(cart2));
    }

    @Test
    void ShouldAddProductsWithMinimalPriceToCart() {
        Cart cart = new Cart();
        Price discountedPrice = Pricer.getDiscountedPrice("Ipad Pro");
        Item item = new Item(new Product("Ipad Pro", discountedPrice), 1);

        cart.add(item);

        assert (cart.getItems().contains(item));
    }

}
