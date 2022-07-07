package hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerTest {
    Computer com1 = new Computer("Hp", 15);
    Computer com2 = new Computer("Asus", 17, 8);
    Computer com3 = new Computer("Hp", 17, "laptop");

    @Test
    @DisplayName("Check com1")
    public void Comp1() {
        assertEquals("Hp", com1.getBrand(), "Brand for com1 is not equals");
        assertEquals(15, com1.getScreenSize(), "ScreenSize for com1 is not equals");
    }

    @Test
    @DisplayName("Check com2")
    public void Comp2() {
        assertEquals("Asus", com2.getBrand(), "Brand for com2 is not equals");
        assertEquals(17, com2.getScreenSize(), "ScreenSize for com2 is not equals");
        assertEquals(8, com2.getNumberOfCores(), "NumberOfCores for com2 is not equals");
    }
    @Test
    @DisplayName("Check com3")
    public void Comp3() {
        assertEquals("Hp", com3.getBrand(), "Brand for com3 is not equals");
        assertEquals(17, com3.getScreenSize(), "ScreenSize for com3 is not equals");
        assertEquals("laptop", com3.getType(), "Type for com3 is not equals");
    }
}