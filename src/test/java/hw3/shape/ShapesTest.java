package hw3.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {

    @Test
    public void checkCircleSquare() {
        Shape shape = new Circle(5);
        assertEquals(78.53981633974483, shape.getSquare(), "The square of the circle is incorrect");
    }

    @Test
    public void checkOvalSquare() {
        Shape shape = new Oval(4, 5);
        assertEquals(62.83185307179586, shape.getSquare(), "The square of the oval is incorrect");
    }

    @Test
    public void checkRectangleSquare() {
        Shape shape = new Rectangle(4, 5);
        assertEquals(20, shape.getSquare(), "The square of the rectangle is incorrect");
    }

    @Test
    public void checkSquareSquare() {
        Shape shape = new Square(5);
        assertEquals(25, shape.getSquare(), "The square of the square is incorrect");
    }
}
