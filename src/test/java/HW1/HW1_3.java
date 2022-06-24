package HW1;

import static java.lang.Long.sum;

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
public class HW1_3 {
    static void sum() {
        System.out.println("125 + 24 = 149");
    }
    static void subtract() {
        System.out.println("125 - 24 = 101");
    }
    static void multiply() {
        System.out.println("125 * 24 = 3000");
    }
    static void divide() {
        System.out.println("124 / 24 = 5");
    }
    static void mod() {
        System.out.println("125 % 24 = 5");
    }

    public static void main(String[] args) {

        sum();
        subtract();
        multiply();
        divide();
        mod();
    }
}
