package hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerTest {

    @Test
    @DisplayName("Check com1")
    public void comp1() {
        Computer computer = new Computer("Hp", 15);
        assertEquals("Hp", computer.getBrand(), "Brand for com1 is not equals");
        assertEquals(15, computer.getScreenSize(), "ScreenSize for com1 is not equals");
    }

    @Test
    @DisplayName("Check com2")
    public void comp2() {
        Computer computer = new Computer("Asus", 17, 8);
        assertEquals("Asus", computer.getBrand(), "Brand for com2 is not equals");
        assertEquals(17, computer.getScreenSize(), "ScreenSize for com2 is not equals");
        assertEquals(8, computer.getNumberOfCores(), "NumberOfCores for com2 is not equals");
    }
    @Test
    @DisplayName("Check com3")
    public void comp3() {
        Computer computer = new Computer("Hp", 17, "laptop");
        assertEquals("Hp", computer.getBrand(), "Brand for com3 is not equals");
        assertEquals(17, computer.getScreenSize(), "ScreenSize for com3 is not equals");
        assertEquals("laptop", computer.getType(), "Type for com3 is not equals");
    }
}