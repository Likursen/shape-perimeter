import exceptions.IncorrectShapeException;
import org.junit.Assert;
import org.junit.Test;
import shapes.Rectangle;

public class RectangleTest {

    @Test(expected = IncorrectShapeException.class)
    public void constructorWithZeroLengthTest() {
        new Rectangle(10, 0);
    }

    @Test(expected = IncorrectShapeException.class)
    public void constructorWithNegativeLengthTest() {
        new Rectangle(10, -1);
    }

    @Test
    public void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle(10, 3);
        Assert.assertEquals(26, rectangle.calculatePerimeter());
    }

    @Test
    public void calculateAreaTest() {
        Rectangle rectangle = new Rectangle(10, 3);
        Assert.assertEquals(30, rectangle.calculateArea());
    }
}