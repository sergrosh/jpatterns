package com.srosh.jpatterns.creational.prototype.shape;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
