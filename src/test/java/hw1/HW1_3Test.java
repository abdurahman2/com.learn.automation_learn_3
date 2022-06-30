package hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
3.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. (Create a separate method for each operation)
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class HW1_3Test {
    @Test
    public void hw1_3() {
        HW1_3 hw1_3 = new HW1_3();
        int sum = hw1_3.getSum(125, 24);
        String subtract = hw1_3.getSubtract("125", "24", "101");
        String multiply = hw1_3.getMultiply("125", "24", "3000");
        String divide = hw1_3.getDivide("125", "24", "5");
        String mod = hw1_3.getMod("125", "24", "5");
        assertEquals(149, HW1_3.sum(), "Incorrect result of sum");
        assertEquals(subtract, HW1_3.subtract(), "Incorrect result of subtract");
        assertEquals(multiply, HW1_3.multiply(), "Incorrect result of multiply");
        assertEquals(divide, HW1_3.divide(), "Incorrect result of divide");
        assertEquals(mod, HW1_3.mod(), "Incorrect result of mod");
    }
}

