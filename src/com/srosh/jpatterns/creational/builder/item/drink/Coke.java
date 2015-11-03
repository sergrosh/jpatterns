package com.srosh.jpatterns.creational.builder.item.drink;

/**
 * Created by sroshchupkin on 11/08/15.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
