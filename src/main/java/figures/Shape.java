package figures;

import figures.characteristics.Colour;

public class Shape {
    private String name;
    private Colour colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour.getColour();
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Shape() {
    }
}
