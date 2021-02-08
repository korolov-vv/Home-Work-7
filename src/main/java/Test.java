import figures.Circle;
import figures.characteristics.Colour;
import utils.ShapePrinter;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setColour(new Colour("Black"));

        new ShapePrinter().shapePrint(circle);
        System.out.println(circle.getColour());
    }
}
