import java.util.Arrays;
import java.util.List;

public class Starter {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        List<Shape> shapes = Arrays.asList(circle, rectangle, triangle);
        for (Shape shape : shapes) {
            shape.calculateAndPrintPerimeter();
            shape.calculateAndPrintArea();
        }
    }
}