public class Hamming {
    public static int compute(String originalDNA, String mutationDNA) {
        int differences = 0;

        if (originalDNA.length() != mutationDNA.length()) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < originalDNA.length(); i++) {
            if (originalDNA.charAt(i) != mutationDNA.charAt(i)) {
                differences++;
            }
        }

        return differences;
    }
}
