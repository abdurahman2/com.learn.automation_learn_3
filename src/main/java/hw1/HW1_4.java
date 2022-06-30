package hw1;

/*
4.	Write a Java program to sum values of an array.
Test Data:
[5,6,7,12,-5,32,43]
Expected Output : 100
 */
public class HW1_4 {
    public int printSumArray() {
        int[] numbers = {5, 6, 7, 12, -5, 32, 43};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        return sum;
    }
}