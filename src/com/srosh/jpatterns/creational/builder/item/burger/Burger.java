package com.srosh.jpatterns.creational.builder.item.burger;

import com.srosh.jpatterns.creational.builder.packing.Wrapper;
import com.srosh.jpatterns.creational.builder.item.Item;
import com.srosh.jpatterns.creational.builder.packing.Packing;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
