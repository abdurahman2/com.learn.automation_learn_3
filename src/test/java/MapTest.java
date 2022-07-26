import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {
    @Test
    public void checkMapTest() {
        MapExample.characterCount("test");
        assertEquals(Map.of('t', 2, 'e', 1, 's', 1), MapExample.characterCount("test"), "Letters and their number are considered correct");
    }
}
