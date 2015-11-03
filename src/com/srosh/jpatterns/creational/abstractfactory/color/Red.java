package com.srosh.jpatterns.creational.abstractfactory.color;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
