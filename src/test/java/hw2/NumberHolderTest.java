package hw2;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberHolderTest {
    @Test
    @DisplayName("Data from constructor")
    public void checkData() {
        NumberHolder numberHolder = new NumberHolder(7, 3.58F);
        assertEquals(7, numberHolder.getAnInt(), "Data are not equal to the AnInt parameter");
        assertEquals(3.58F, numberHolder.getaFloat(), "Data are not equal to the aFloat parameter");
    }

    @Test
    @DisplayName("Data was set")
    public void checkData2() {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.setAnInt(7);
        numberHolder.setaFloat(3.58F);
        assertEquals(7, numberHolder.getAnInt(), "Data are not equal to the set AnInt parameter");
        assertEquals(3.58F, numberHolder.getaFloat(), "Data are not equal to the set aFloat parameter");
    }
}