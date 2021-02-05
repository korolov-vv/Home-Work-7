package figures;

import figuresProperties.Colour;

public class Shape {
    String name;
    Colour colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Shape() {
    }
}
