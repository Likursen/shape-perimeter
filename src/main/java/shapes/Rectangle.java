package shapes;

import exceptions.IncorrectShapeException;
import utils.Utils;

public class Rectangle extends Shape {

    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        if (firstSide <= 0 || secondSide <= 0) {
            throw new IncorrectShapeException("incorrect rectangle side length");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle() {
        System.out.println("Enter the length and width for the rectangle");
        this.firstSide = Utils.scanNumber();
        this.secondSide = Utils.scanNumber();
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("shape.Rectangle perimeter " + calculatePerimeter());
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("shape.Rectangle area " + calculateArea());
    }

    public int calculateArea() {
        return firstSide * secondSide;
    }

    public int calculatePerimeter() throws IncorrectShapeException {
        return (firstSide + secondSide) * 2;
    }
}