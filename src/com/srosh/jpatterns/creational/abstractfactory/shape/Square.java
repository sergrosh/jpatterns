package com.srosh.jpatterns.creational.abstractfactory.shape;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
