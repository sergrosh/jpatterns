package com.srosh.jpatterns.creational.abstractfactory;

import com.srosh.jpatterns.creational.abstractfactory.color.Color;
import com.srosh.jpatterns.creational.abstractfactory.shape.Shape;


/**
 * Created by sroshchupkin on 10/08/15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
