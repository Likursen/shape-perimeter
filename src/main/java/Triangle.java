public class Triangle extends Shape {

    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle() {
        System.out.println("Enter the length of thee sides for the triangle");
        this.firstSide = Utils.scanNumber();
        this.secondSide = Utils.scanNumber();
        this.thirdSide = Utils.scanNumber();
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("Triangle perimeter " + getPerimeter());
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Triangle area " + getArea());
    }

    private double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    private double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}