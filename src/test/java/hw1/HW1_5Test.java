package hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class HW1_5Test {
    @Test
    public void checkDup() {
        HW1_5 hw1_5 = new HW1_5();
        Assertions.assertEquals(List.of(6, 12), hw1_5.getSetOfDuplicateValues(List.of(5, 6, 7, 12, -5, 32, 43, 6, 12)), "Incorrect duplicate values");
    }
}