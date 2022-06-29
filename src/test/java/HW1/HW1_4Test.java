package HW1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
4.	Write a Java program to sum values of an array.
Test Data:
[5,6,7,12,-5,32,43]
Expected Output : 100
 */
public class HW1_4Test {
    @Test
public void HW1_4(){
        HW1_4 hw1_4 = new HW1_4();
        assertEquals(100, hw1_4.PrintSumArray(), "Not equals");
    }
}
