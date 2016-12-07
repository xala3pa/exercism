public class Bob {
    public String hey(String sentence) {
        if (sentence.toUpperCase().equals(sentence) && sentence.matches(".*[A-Za-z].*")) {
            return "Whoa, chill out!";
        } else if (sentence.endsWith("?")) {
            return "Sure.";
        } else if (sentence.trim().isEmpty()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }
}
