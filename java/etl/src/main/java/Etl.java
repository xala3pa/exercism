import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> transformerMap = new HashMap<>();

        old.forEach((score, letters) -> letters.forEach(letter -> transformerMap.put(letter.toLowerCase(), score)));

        return transformerMap;
    }
}
