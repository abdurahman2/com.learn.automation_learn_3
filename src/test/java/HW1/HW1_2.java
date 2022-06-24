package HW1;

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
    public static void main(String[] args) {
        int a, b, c, d;
        a = -5 + 8 * 6;
        b = (55 + 9) % 9;
        c = 20 + -3 * 5 / 8;
        d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
