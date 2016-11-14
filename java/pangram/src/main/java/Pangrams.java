import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Pangrams {
    public static boolean isPangram(String sentence) {
        return isUsingAllAlphabet(sentence.toLowerCase());
    }

    private static boolean isUsingAllAlphabet(String lowerCaseSentence) {
        return IntStream.rangeClosed('a', 'z').
                allMatch(contains(lowerCaseSentence));
    }

    private static IntPredicate contains(String sentence) {
        return letter -> sentence.indexOf(letter) > -1;
    }
}
