package hw2;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberHolderTest {

    NumberHolder numberHolder = new NumberHolder(7, 3.58F);
    NumberHolder numberHolder2 = new NumberHolder();

    @Test
    @DisplayName("Data from constructor")
    public void checkData() {
        assertEquals(7,numberHolder.getAnInt(),"Data are not equal to the AnInt parameter");
        assertEquals(3.58F,numberHolder.getaFloat(),"Data are not equal to the aFloat parameter");
    }

    @Test
    @DisplayName("Data was set")
    public void checkData2(){
        numberHolder2.setAnInt(7);
        numberHolder2.setaFloat(3.58F);
        assertEquals(7,numberHolder2.getAnInt(),"Data are not equal to the set AnInt parameter");
        assertEquals(3.58F,numberHolder2.getaFloat(),"Data are not equal to the set aFloat parameter");
    }
}