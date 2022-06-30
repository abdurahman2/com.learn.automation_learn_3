package hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
1.	Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
 */
public class HW1_1Test {
    @Test
    @DisplayName("Write a Java program to print the sum of two numbers.")
    public void HW1_1() {
        System.out.println();
        HW1_1 hw1_1 = new HW1_1();
        assertEquals(110, hw1_1.printSum(), "Incorrect result of sum");
    }
}
