package lambdastreams.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsStartO {
    public static List<String> getWordsStartO(String text) {
        return Arrays.stream(text
                        .split(" "))
                .filter(text2 -> text2.toLowerCase().startsWith("o")).collect(Collectors.toList());
    }
}
