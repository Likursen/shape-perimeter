import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;
import utils.Utils;

import java.util.Arrays;
import java.util.List;

public class Starter {

    public static void main(String[] args) {
        Circle circle = createCircle();
        Rectangle rectangle = createRectangle();
        Triangle triangle = createTriangle();
        List<Shape> shapes = Arrays.asList(circle, rectangle, triangle);
        for (Shape shape : shapes) {
            shape.calculateAndPrintPerimeter();
            shape.calculateAndPrintArea();
        }
    }

    private static Circle createCircle() {
        System.out.println("enter the radius of the circle");
        int radius = Utils.scanNumber();
        return new Circle(radius);
    }

    private static Rectangle createRectangle() {
        System.out.println("enter the sides of the rectangle");
        int firstSide = Utils.scanNumber();
        int secondSide = Utils.scanNumber();
        return new Rectangle(firstSide, secondSide);
    }

    private static Triangle createTriangle() {
        System.out.println("enter the sides of the triangle");
        int firstSide = Utils.scanNumber();
        int secondSide = Utils.scanNumber();
        int thirdSide = Utils.scanNumber();
        return new Triangle(firstSide, secondSide, thirdSide);
    }
}