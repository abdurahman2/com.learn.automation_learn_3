package hw1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
5.	Write a Java program to find the duplicate values of an array of integer values.
Test Data:
[5,6,7,12,-5,32,43,6,12]
Expected Output : 6,12
 */
public class HW1_5 {
    public List<Integer> getSetOfDuplicateValues(List<Integer> values) {
        Set<Integer> duplicates = new HashSet<>();
        return values.stream()
                .filter(value -> !duplicates.add(value))
                .collect(Collectors.toList());
    }
}