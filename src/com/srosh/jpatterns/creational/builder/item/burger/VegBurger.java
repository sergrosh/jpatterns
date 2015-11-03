package com.srosh.jpatterns.creational.builder.item.burger;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
