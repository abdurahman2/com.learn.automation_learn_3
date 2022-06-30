package hw1;

/*
2.	Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
*/
public class HW1_2 {
    public int getA() {
        int a = -5 + 8 * 6;
        System.out.println(a);
        return a;
    }

    public int getB() {
        int b = (55 + 9) % 9;
        System.out.println(b);
        return b;
    }

    public int getC() {
        int c = 20 + -3 * 5 / 8;
        System.out.println(c);
        return c;
    }

    public int getD() {
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(d);
        return d;
    }
}
