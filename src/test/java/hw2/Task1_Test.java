package hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1_Test {
    @Test
    @DisplayName("The concatenated string with replacements")
    public void checkReplace() {
        Task1 con = new Task1();
        con.conctenate();
        String result = "H Exercises and ython Exercises";
        assertEquals(result, con.conctenate(), "Errors in replacements");
    }
}