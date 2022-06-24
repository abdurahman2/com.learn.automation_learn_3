package HW1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/*
5.	Write a Java program to find the duplicate values of an array of integer values.
Test Data:
[5,6,7,12,-5,32,43,6,12]
Expected Output : 6,12
 */
public class HW1_5 {
    public static void main(String[] args) {
//        int[] myArray = {5, 6, 7, 12, -5, 32, 43, 6, 12};
//        for (int i = 0; i < myArray.length; i++) {
//            for (int j = i + 1; j < myArray.length; j++) {
//                if (myArray[i] == myArray[j])
//                    System.out.println(myArray[i]);

        Integer[] names = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        // First solution : finding duplicates using brute force method
        System.out.println("Finding duplicate elements in array using brute force method");
        for (int x = 0; x < names.length; x++) {
            for (int y = x + 1; y < names.length; y++) {
                if (names[x].equals(names[y])) {
                    // got the duplicate element
                    System.out.println(names[x]);


//                int array[] = {5, 6, 7, 12, -5, 32, 43, 6, 12};
//                HashMap<Integer, Integer> duplicates = new HashMap<Integer, Integer>();
//                for (int b = 0; b < array.length; b++) {
//                    if (duplicates.containsKey(array[b])) {
//                        int numberOfOccurances = duplicates.get(array[b]);
//                        duplicates.put(array[b], (numberOfOccurances + 1));
//                    } else {
//                        duplicates.put(array[b], 1);
//                    }
//                }
//                Iterator<Integer> keys = duplicates.keySet().iterator();
//                System.out.print("Duplicates : ");
//                while (keys.hasNext()) {
//                    int k = keys.next();
//                    if (duplicates.get(k) > 1) {
//                        System.out.print(" " + k);
//                    }
//                }

                }
            }
        }
    }
}
//    }
//}

