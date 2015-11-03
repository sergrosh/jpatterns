package com.srosh.jpatterns.creational.abstractfactory;

import com.srosh.jpatterns.creational.abstractfactory.color.Blue;
import com.srosh.jpatterns.creational.abstractfactory.color.Color;
import com.srosh.jpatterns.creational.abstractfactory.color.Green;
import com.srosh.jpatterns.creational.abstractfactory.color.Red;
import com.srosh.jpatterns.creational.abstractfactory.shape.Shape;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
