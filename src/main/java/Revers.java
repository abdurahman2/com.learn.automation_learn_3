import java.util.*;

public class Revers {

    public static <K, V> Map<K, V> createMapOption1(List<K> keys, List<V> values) {
        Map<K, V> map = new HashMap<>();
        for (K key : keys) {
            if (values.isEmpty()) {
                map.put(key, null);
            } else {
                map.put(key, values.remove(0));
            }
        }
        return map;
    }

    public static <K, V> Map<K, V> createMapOption2(List<K> keys, List<V> values) throws Exception {
        Map<K, V> map = new HashMap<>();
        if (keys.size() != values.size()) {
            String exceptionMessage = keys.size() > values.size() ?
                    "Value is not enough for the Map" :
                    "Key is not enough for the Map";
            throw new Exception(exceptionMessage);
        }
        for (K k : keys) {
            int index = keys.indexOf(k);
            map.put(k, values.get(index));
        }
        return map;
    }
}
