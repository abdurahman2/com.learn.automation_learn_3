import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedTest {

    @Test
    public void keysEqualsValues() {
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
        Sorted.createMapOption1(keys, values).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    public void keysMoreThanValues() {
        List<Integer> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        keys.add(3);
        keys.add(4);
        values.add("c");
        values.add("d");
        Sorted.createMapOption1(keys, values).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    public void valuesMoreThanKeys() {
        List<Integer> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        values.add("a");
        values.add("b");
        values.add("c");
        values.add("d");
        Sorted.createMapOption1(keys, values).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    public void keysEqualsValuesException() {
        List<Integer> keys = Arrays.asList(1, 2, 3);
        List<String> values = Arrays.asList("a", "b", "c");
        Sorted.createMapOption2(keys, values).forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    public void keysMoreThanValuesException() {
        List<Integer> keys = Arrays.asList(1, 2);
        List<String> values = Arrays.asList("a", "b", "c");
        try {
            Sorted.createMapOption2(keys, values);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void valuesMoreThanKeysException() {
        List<Integer> keys = Arrays.asList(1, 2, 3);
        List<String> values = Arrays.asList("a", "b");
        try {
            Sorted.createMapOption2(keys, values);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
