public class Hamming {
    public static int compute(String a, String a1) {
        int differences = 0;

        if (a.length() != a1.length()) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a1.charAt(i)) {
                differences++;
            }
        }

        return differences;
    }
}
