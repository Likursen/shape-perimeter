package shapes;

import exceptions.IncorrectShapeException;
import utils.Utils;

public class Circle extends Shape {

    private final int radius;


    public Circle(int radius) {
        if (radius <= 0) {
            throw new IncorrectShapeException("incorrect circle radius");
        }
        this.radius = radius;
    }

    public Circle() {
        System.out.println("Enter the radius for the circle");
        this.radius = Utils.scanNumber();
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("shape.Circle perimeter: " + calculatePerimeter());
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("shape.Circle area " + calculateArea());
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}