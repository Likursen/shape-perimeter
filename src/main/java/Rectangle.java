public class Rectangle extends Shape {

    static {
        System.out.println("Enter the length and width for the rectangle");
    }

    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Rectangle area " + firstSide * secondSide);
    }
}