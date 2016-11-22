import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    private String anagram;

    Anagram(String anagram) {
        this.anagram = anagram;
    }

    List<String> match(List<String> wordsList) {
        return wordsList.stream()
                .filter(word -> isAnagram(word.toLowerCase(), anagram.toLowerCase()))
                .collect(Collectors.toList());
    }

    private static boolean isAnagram(String word, String anagram) {
        return isSameLength(word, anagram)
                && hasSameChars(word, anagram)
                && !isSameWord(word, anagram);
    }

    private static boolean isSameWord(String word, String anagram) {
        return word.equals(anagram);
    }

    private static boolean isSameLength(String word, String anagram) {
        return word.length() == anagram.length();
    }

    private static boolean hasSameChars(String word, String anagram) {
        char[] wordChars = word.toCharArray();
        char[] anagramChars = anagram.toCharArray();
        Arrays.sort(wordChars);
        Arrays.sort(anagramChars);
        String orderedWord = new String(wordChars);
        String orderedAnagram = new String(anagramChars);

        return orderedWord.equals(orderedAnagram);
    }
}
