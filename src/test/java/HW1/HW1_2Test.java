package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW1_2Test {
    @Test
    public void CheckABCD() {
        HW1_2 hw_12 = new HW1_2();
        Assertions.assertEquals(43, hw_12.A(), "Not equals");
        Assertions.assertEquals(1, hw_12.B(), "Not equals");
        Assertions.assertEquals(19, hw_12.C(), "Not equals");
        Assertions.assertEquals(13, hw_12.D(), "Not equals");
    }

    @Test
    public void checkA() {
        HW1_2 hw_12 = new HW1_2();
        Assertions.assertEquals(43, hw_12.A(), "Not equals");
    }

    @Test
    public void checkB() {
        HW1_2 hw_12 = new HW1_2();
        Assertions.assertEquals(1, hw_12.B(), "Not equals");
    }

    @Test
    public void checkC() {
        HW1_2 hw_12 = new HW1_2();
        Assertions.assertEquals(19, hw_12.C(), "Not equals");
    }

    @Test
    public void checkD() {
        HW1_2 hw_12 = new HW1_2();
        Assertions.assertEquals(13, hw_12.D(), "Not equals");
    }
}
