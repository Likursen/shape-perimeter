package shapes;

import exceptions.IncorrectShapeException;
import interfaces.AreaCalculable;

import java.util.Arrays;

public abstract class Shape implements AreaCalculable {

    public abstract void calculateAndPrintPerimeter();

    protected void validateSidesLengths(int... sideLength) {
        if (sideLength.length > 0)
            if (Arrays.stream(sideLength)
                    .min()
                    .getAsInt() <= 0) {
                throw new IncorrectShapeException("Side length cannot be negative");
            } else {
                throw new RuntimeException("the lengths of the sides of the figure are not entered");
            }
    }
}