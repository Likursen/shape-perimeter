public class Circle extends Shape {

    private final int radius;

    public Circle() {
        System.out.println("Enter the radius for the circle");
        this.radius = Utils.scanNumber();
    }

    @Override
    public void calculateAndPrintPerimeter() {
        System.out.println("Circle perimeter: " + getPerimeter());
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Circle area " + getArea());
    }

    private double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    private double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}