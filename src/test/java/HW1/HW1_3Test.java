package HW1;

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
    public void HW1_3() {
        HW1_3 hw1_3 = new HW1_3();
        String text1 = hw1_3.getText1("125", "24", "149");
        String text2 = hw1_3.getText2("125", "24", "101");
        String text3 = hw1_3.getText3("125", "24", "3000");
        String text4 = hw1_3.getText4("125", "24", "5");
        String text5 = hw1_3.getText5("125", "24", "5");
        assertEquals(text1, HW1_3.sum(),"Not equals1");
        assertEquals(text2, HW1_3.subtract(),"Not equals2");
        assertEquals(text3, HW1_3.multiply(),"Not equals3");
        assertEquals(text4, HW1_3.divide(),"Not equals4");
        assertEquals(text5, HW1_3.mod(),"Not equals5");
    }
}

