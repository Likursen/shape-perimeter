package shapes;

public class Rectangle extends Shape {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        validateSidesLengths(firstSide, secondSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("Rectangle perimeter " + calculatePerimeter());
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Rectangle area " + calculateArea());
    }

    public int calculateArea() {
        return firstSide * secondSide;
    }

    public int calculatePerimeter() {
        return (firstSide + secondSide) * 2;
    }
}