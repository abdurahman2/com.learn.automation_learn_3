import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDuplicateTest extends DeleteDuplicate {
    @Test
    public void checkDuplicateClass() {
        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str1");
        list.add("str2");
        list.add("str2");
        list.add("str3");
        assertEquals(3, createDuplicateCollection(list).size(), "Quantity of unique numbers");
    }
}
