package hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HW1_4Test {
    @Test
    public void hw1_4() {
        HW1_4 hw1_4 = new HW1_4();
        int[] numbers = {5, 6, 7, 12, -5, 32, 43};
        assertEquals(100, hw1_4.printSumArray(numbers), "Incorrect result of sum values");
    }
}