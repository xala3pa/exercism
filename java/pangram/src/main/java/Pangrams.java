public class Pangrams {
    public static boolean isPangram(String sentence) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (char letter : alphabet) {
            if (!containsAnyLetter(sentence, letter)) {
                return false;
            }
        }

        return true;
    }

    private static boolean containsAnyLetter(String sentence, char letter) {
        return sentence.toLowerCase().contains(String.valueOf(letter));
    }
}
