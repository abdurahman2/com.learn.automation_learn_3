import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversTest {

    @Test
    public void keysEqualsValues() throws Exception {
        List<Integer> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        keys.add(3);
        keys.add(4);
        values.add("a");
        values.add("b");
        values.add("c");
        values.add("d");
        Revers.createMapOption1(keys, values).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    public void keysMoreThenValues() {
        List<Integer> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        keys.add(3);
        keys.add(4);
        values.add("c");
        values.add("d");
        Revers.createMapOption1(keys, values).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    public void valuesMoreThenKeys() {
        List<Integer> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        values.add("a");
        values.add("b");
        values.add("c");
        values.add("d");
        Revers.createMapOption1(keys, values).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    public void keysEqualsValuesException() throws Exception {
        List<Integer> keys = Arrays.asList(1, 2, 3);
        List<String> values = Arrays.asList("a", "b", "c");
        Revers.createMapOption2(keys, values).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    public void keysMoreThenValuesException() {
        List<Integer> keys = Arrays.asList(1, 2);
        List<String> values = Arrays.asList("a", "b", "c");
        try {
            Revers.createMapOption2(keys, values);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void valuesMoreThenKeysException() {
        List<Integer> keys = Arrays.asList(1, 2, 3);
        List<String> values = Arrays.asList("a", "b");
        try {
            Revers.createMapOption2(keys, values);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
