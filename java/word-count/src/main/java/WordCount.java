import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCount {
    public Map<String, Integer> phrase(String phrase) {

        return Pattern.compile("\\W+").splitAsStream(phrase).
                collect(Collectors.groupingBy(String::toLowerCase, Collectors.summingInt( word -> 1)));
    }
}
