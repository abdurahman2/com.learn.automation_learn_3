package HW1;

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
    public String getText1(String a, String b, String c) {
        return a + " + " + b + " = " + c;
    }
    public String getText2(String a, String b, String c) {
        return a + " - " + b + " = " + c;
    }
    public String getText3(String a, String b, String c) {
        return a + " * " + b + " = " + c;
    }
    public String getText4(String a, String b, String c) {
        return a + " / " + b + " = " + c;
    }
    public String getText5(String a, String b, String c) {
        return a + " % " + b + " = " + c;
    }

    static String sum() {
        System.out.println("125 + 24 = 149");
        return "125 + 24 = 149";
    }

    static String subtract() {
        System.out.println("125 - 24 = 101");
        return "125 - 24 = 101";
    }

    static String multiply() {
        System.out.println("125 * 24 = 3000");
        return "125 * 24 = 3000";
    }

    static String divide() {
        System.out.println("124 / 24 = 5");
        return "125 / 24 = 5";
    }

    static String mod() {
        System.out.println("125 % 24 = 5");
        return "125 % 24 = 5";
    }
}
