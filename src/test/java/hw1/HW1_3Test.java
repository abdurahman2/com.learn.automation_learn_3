package hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HW1_3Test {
    @Test
    public void hw1_3() {
        HW1_3 hw1_3 = new HW1_3();
        assertEquals(149, hw1_3.getSum(125, 24), "Incorrect result of sum");
        assertEquals(101, hw1_3.getSubtract(125, 24), "Incorrect result of subtract");
        assertEquals(3000, hw1_3.getMultiply(125, 24), "Incorrect result of multiply");
        assertEquals(5, hw1_3.getDivide(125, 24), "Incorrect result of divide");
        assertEquals(5, hw1_3.getMod(125, 24), "Incorrect result of mod");
    }
}