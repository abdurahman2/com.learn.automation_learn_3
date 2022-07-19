package hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1_Test {
    @Test
    @DisplayName("The concatenated string with replacements")
    public void checkReplace() {
        String result = "H Exercises and ython Exercises";
        assertEquals(result, Task1.concatenateAndRemovePFromTwoStrings("PHP Exercises and ", "Python Exercises"), "Errors in replacements");
    }
}