import exceptions.IncorrectShapeException;
import org.junit.Assert;
import org.junit.Test;
import shapes.Circle;

public class CircleTest {

    @Test(expected = IncorrectShapeException.class)
    public void constructorWithZeroLengthTest() {
        new Circle(0);
    }

    @Test(expected = IncorrectShapeException.class)
    public void constructorWithNegativeLengthTest() {
        new Circle(-1);
    }

    @Test
    public void calculatePerimeterTest() {
        Circle circle = new Circle(10);
        Assert.assertEquals(62.831, circle.calculatePerimeter(), 0.01);
    }

    @Test
    public void calculateAreaTest() {
        Circle circle = new Circle(10);
        Assert.assertEquals(314.159, circle.calculateArea(), 0.01);
    }
}
