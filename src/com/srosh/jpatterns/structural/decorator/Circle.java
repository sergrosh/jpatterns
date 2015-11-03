package com.srosh.jpatterns.structural.decorator;

/**
 * Created by sroshchupkin on 13/08/15.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
