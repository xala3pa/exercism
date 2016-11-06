import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        return old.entrySet().stream()
                .flatMap(index -> index.getValue().stream()
                        .map(letter -> new SimpleEntry<>(index.getKey(), letter.toLowerCase())))
                .collect(Collectors.toConcurrentMap(SimpleEntry::getValue, SimpleEntry::getKey));
    }
}
