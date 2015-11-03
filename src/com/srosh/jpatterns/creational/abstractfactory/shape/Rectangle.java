package com.srosh.jpatterns.creational.abstractfactory.shape;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
