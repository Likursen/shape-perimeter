package shapes;

import exceptions.IncorrectShapeException;

public class Triangle extends Shape {

    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        validateTriangle(firstSide, secondSide, thirdSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("Triangle perimeter " + calculatePerimeter());
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Triangle area " + calculateArea());
    }

    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    public int calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    private void validateTriangle(int firstSide, int secondSide, int thirdSide) {
        validateSidesLengths(firstSide, secondSide, thirdSide);
        validateTriangleSize(firstSide, secondSide, thirdSide);
    }

    private void validateTriangleSize(int firstSide, int secondSide, int thirdSide) {
        if (!(firstSide + secondSide >= thirdSide
                && thirdSide + firstSide >= secondSide
                && secondSide + thirdSide >= firstSide)) {
            throw new IncorrectShapeException("The sides of the triangle are set incorrectly. The sum of any two" +
                    " sides must be greater than the third");
        }
    }
}