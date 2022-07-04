package hw1;

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
    public int getSum(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        return c;
    }

    public int getSubtract(int a, int b) {
        int c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        return c;
    }

    public int getMultiply(int a, int b) {
        int c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        return c;
    }

    public int getDivide(int a, int b) {
        int c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        return c;
    }

    public int getMod(int a, int b) {
        int c = a % b;
        System.out.println(a + " % " + b + " = " + c);
        return c;
    }
}