package com.srosh.jpatterns.creational.builder.item.drink;

/**
 * Created by sroshchupkin on 11/08/15.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}