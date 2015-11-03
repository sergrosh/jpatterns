package com.srosh.jpatterns.creational.builder.item.burger;

/**
 * Created by sroshchupkin on 11/08/15.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
