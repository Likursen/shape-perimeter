package shapes;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        validateSidesLengths(radius);
        this.radius = radius;
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("Circle perimeter: " + calculatePerimeter());
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Circle area " + calculateArea());
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}