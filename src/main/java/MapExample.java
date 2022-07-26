import java.util.*;

public class MapExample {
    static Map<Character, Integer> characterCount(String inputString) {
        Map<Character, Integer> map = new TreeMap<>();
        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
