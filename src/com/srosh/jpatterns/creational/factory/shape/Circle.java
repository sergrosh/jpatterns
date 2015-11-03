package com.srosh.jpatterns.creational.factory.shape;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
