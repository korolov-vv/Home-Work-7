package Figures;
import FiguresProperties.Colour;

public class Circle implements Shape {
    private final String name = "Figures.Circle";
    Colour colour;

    public String getName() {
        return name;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void printName() {
        System.out.println("This geometrical figure is named " + getName());
        System.out.println("And this " + getName() + "is " + getColour());
    }
}