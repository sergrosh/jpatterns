package com.srosh.jpatterns.creational.factory;


import com.srosh.jpatterns.creational.factory.shape.Circle;
import com.srosh.jpatterns.creational.factory.shape.Rectangle;
import com.srosh.jpatterns.creational.factory.shape.Shape;
import com.srosh.jpatterns.creational.factory.shape.Square;

/**
 * Created by sroshchupkin on 10/08/15.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}