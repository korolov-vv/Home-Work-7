package utils;

import figures.Shape;

public class ShapePrinter {
    public void shapePrint(Shape shape){
        System.out.println("This geometrical figure is named " + shape.getName());
        System.out.println("And this " + shape.getName() + " is " + shape.getColour());
    }
}
