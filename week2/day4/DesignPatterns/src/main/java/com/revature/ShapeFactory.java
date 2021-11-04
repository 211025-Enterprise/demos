package com.revature;

import com.revature.shapes.*;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType){
        switch(shapeType){
            case CIRCLE: return new Circle();
            case SQUARE: return new Square();
            case TRIANGLE: return new Triangle();
        }

        return null;
    }
}
