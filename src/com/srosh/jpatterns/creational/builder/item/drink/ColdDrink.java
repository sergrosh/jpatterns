package com.srosh.jpatterns.creational.builder.item.drink;

import com.srosh.jpatterns.creational.builder.item.Item;
import com.srosh.jpatterns.creational.builder.packing.Bottle;
import com.srosh.jpatterns.creational.builder.packing.Packing;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
