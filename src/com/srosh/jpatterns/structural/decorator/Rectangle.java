package com.srosh.jpatterns.structural.decorator;

/**
 * Created by sroshchupkin on 13/08/15.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
