package hw2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomethingIsWrongTest {

    @Test
    public void testArea() {
        Rectangle myRect = new Rectangle(40, 50);
        assertEquals(2000, myRect.getArea(), "Mistakes in calculation of area");
    }
}