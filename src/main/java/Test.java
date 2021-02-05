import figures.Circle;
import figuresProperties.Colour;
import utills.ShapePrinter;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setColour(new Colour("Black"));

        new ShapePrinter().shapePrint(circle);
    }
}
