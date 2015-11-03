package com.srosh.jpatterns.structural.bridge;

/**
 * Created by sroshchupkin on 12/08/15.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
