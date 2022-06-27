import exceptions.IncorrectShapeException;
import org.junit.Assert;
import org.junit.Test;
import shapes.Triangle;

public class TriangleTest {

    @Test(expected = IncorrectShapeException.class)
    public void constructorWithZeroLengthTest() {
        new Triangle(10, 0, 10);
    }

    @Test(expected = IncorrectShapeException.class)
    public void constructorWithNegativeLengthTest() {
        new Triangle(10, -1, 10);
    }

    @Test(expected = IncorrectShapeException.class)
    public void constructorWithIncorrectSideLengthTest() {
        new Triangle(2, 10, 2);
    }

    @Test
    public void calculatePerimeterTest() {
        Triangle triangle = new Triangle(10, 10, 15);
        Assert.assertEquals(35, triangle.calculatePerimeter());
    }

    @Test
    public void calculateAreaTest() {
        Triangle triangle = new Triangle(10, 10, 15);
        Assert.assertEquals(49.607, triangle.calculateArea(), 0.01);
    }
}