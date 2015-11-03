package com.srosh.jpatterns.creational.builder.item;

import com.srosh.jpatterns.creational.builder.packing.Packing;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
