package hw2;

/*
1.	Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
Test Data:
String 1: PHP Exercises and
String 2: Python Exercises
Expected output:
The concatenated string with replacements: H Exercises and ython Exercises

 */
public class Task1 {
    public String conctenate() {


        String a = "PHP Exercises and ";
        String b = "Python Exercises";
        String c = a + b;
        String replacements = c.replace("P", "");
        return replacements;
    }
}