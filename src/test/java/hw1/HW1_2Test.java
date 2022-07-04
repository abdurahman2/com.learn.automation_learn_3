package hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW1_2Test {
    HW1_2 hw_12 = new HW1_2();

    @Test
    public void checkABCD() {
        Assertions.assertEquals(43, hw_12.getA(), "Incorrect result of ABCD");
        Assertions.assertEquals(1, hw_12.getB(), "Incorrect result of A");
        Assertions.assertEquals(19, hw_12.getC(), "Incorrect result of B");
        Assertions.assertEquals(13, hw_12.getD(), "Incorrect result of C");
    }

    @Test
    public void checkA() {
        Assertions.assertEquals(43, hw_12.getA(), "Incorrect result of A");
    }

    @Test
    public void checkB() {
        Assertions.assertEquals(1, hw_12.getB(), "Incorrect result of B");
    }

    @Test
    public void checkC() {
        Assertions.assertEquals(19, hw_12.getC(), "Incorrect result of C");
    }

    @Test
    public void checkD() {
        Assertions.assertEquals(13, hw_12.getD(), "Incorrect result of D");
    }
}