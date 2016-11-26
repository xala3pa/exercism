public class Pangrams {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static boolean isPangram(String sentence) {
        return ALPHABET.chars()
                .mapToObj(letter -> (char) letter)
                .allMatch(letter -> sentence.toLowerCase().contains(letter.toString()));
    }
}