package com.srosh.jpatterns.structural.bridge;

/**
 * Created by sroshchupkin on 12/08/15.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}