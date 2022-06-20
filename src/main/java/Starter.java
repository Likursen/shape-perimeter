import java.util.Arrays;
import java.util.List;

public class Starter {

    public static void main(String[] args) {
        Circle circle = new Circle(Utils.scanNumber());
        Rectangle rectangle = new Rectangle(Utils.scanNumber(), Utils.scanNumber());
        Triangle triangle = new Triangle(Utils.scanNumber(), Utils.scanNumber(), Utils.scanNumber());
        List<Shape> shapes = Arrays.asList(circle, rectangle, triangle);
        for (Shape shape : shapes) {
            shape.calculateAndPrintArea();
        }
    }
}