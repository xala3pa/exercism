import java.util.Arrays;
import java.util.function.Predicate;

public class Bob {

    enum Type {
        QUESTION(isSilent, "Fine. Be that way!"),
        YELL(isYelling, "Whoa, chill out!"),
        NOTHING(isQuestion, "Sure."),
        WHATEVER(sentence -> true, "Whatever.");

        Predicate<String> predicate;
        String sentence;

        Type(Predicate<String> predicate, String sentence) {
            this.predicate = predicate;
            this.sentence = sentence;
        }
    }

    private static Predicate<String> isSilent = sentence -> sentence.trim().isEmpty();

    private static Predicate<String> isYelling = sentence -> sentence.matches(".*[a-zA-Z]+.*")
            && sentence.toUpperCase().equals(sentence);

    private static Predicate<String> isQuestion = sentence -> sentence.endsWith("?");

    public String hey(String sentence) {


        return Arrays.stream(Type.values())
                .filter(e -> e.predicate.test(sentence))
                .findFirst()
                .get().sentence;
    }

}
