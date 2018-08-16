import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RnaTranscription {

    private static final String GUANINE = "G";
    private static final String CYTOSINE = "C";
    private static final String THYMINE = "T";
    private static final String URACIL = "U";
    private static final String ADENINE = "A";

    String transcribe(String dnaStrand) {

        return dnaStrand.chars()
          .mapToObj(nucleotide -> nucleotideTranscription((char)nucleotide))
          .collect(Collectors.joining());
    }

    private String nucleotideTranscription(char dnaStrand) {
        Map<String, String> transcriptionMap = Collections.unmodifiableMap(Stream.of(
          new SimpleEntry<>(GUANINE, CYTOSINE),
          new SimpleEntry<>(CYTOSINE, GUANINE),
          new SimpleEntry<>(THYMINE, ADENINE),
          new SimpleEntry<>(ADENINE, URACIL)
        ).collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue)));

        return transcriptionMap.get(String.valueOf(dnaStrand));
    }

}
