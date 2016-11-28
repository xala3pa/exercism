import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    private String anagram;

    Anagram(String anagram) {
        this.anagram = anagram.toLowerCase();
    }

    List<String> match(List<String> wordsList) {
        return wordsList.stream()
                .filter(this::isDifferentWord)
                .filter(this::hasSameChars)
                .collect(Collectors.toList());
    }

    private boolean isDifferentWord(String word) {
        return !word.toLowerCase().equals(anagram);
    }

    private boolean hasSameChars(String word) {
        return toOrderedString(word.toLowerCase()).equals(toOrderedString(anagram));
    }

    private String toOrderedString(String word) {
        char[] wordChars = word.toCharArray();
        Arrays.sort(wordChars);

        return new String(wordChars);
    }
}
