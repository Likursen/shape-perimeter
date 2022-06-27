package shapes;

import exceptions.IncorrectShapeException;
import utils.Utils;

public class Triangle extends Shape {

    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new IncorrectShapeException("incorrect triangle side length");
        } else {
            if (firstSide + secondSide < thirdSide
                    || thirdSide + firstSide < secondSide
                    || secondSide + thirdSide < firstSide) {
                throw new IncorrectShapeException("incorrect triangle side length");
            }
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Triangle() {
        System.out.println("Enter the length of thee sides for the triangle");
        this.firstSide = Utils.scanNumber();
        this.secondSide = Utils.scanNumber();
        this.thirdSide = Utils.scanNumber();
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("shape.Triangle perimeter " + calculatePerimeter());
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("shape.Triangle area " + calculateArea());
    }

    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    public int calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}