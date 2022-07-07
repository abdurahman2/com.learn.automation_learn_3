package hw2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomethingIsWrongTest {
    Rectangle myRect = new Rectangle(40, 50);

    @Test
    public void testArea() {
        assertEquals(2000, myRect.getArea(), "Mistakes in calculation of area");
    }
}
//        myRect.width = 40;
//        myRect.height = 50;
//        System.out.println("myRect's area is " + myRect.area());
//}
//}