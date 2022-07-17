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
    String str1 = "PHP Exercises and ";
    String str2 = "Python Exercises";

    //    static public String concatenate(String str1, String str2) {
//        return concatenate(str1,str2).replace("P", "").replace("p", "");
//    }
    static public String concatenate() {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        return str1.concat(str2).replace("P", "").replace("p", "");
    }
}