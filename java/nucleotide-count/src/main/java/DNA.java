import java.util.HashMap;
import java.util.Map;

class DNA {

    private static final Character A_SYMBOL = 'A';
    private static final Character C_SYMBOL = 'C';
    private static final Character G_SYMBOL = 'G';
    private static final Character T_SYMBOL = 'T';

    private String DNAString;
    private HashMap<Character, Integer> nucleotideCount;


    DNA(String DNA) {
        DNAString = DNA;
        initializeNucleotideCount();
        countNucleotides();
    }

    int count(char nucleotide) {
        try {
            return nucleotideCount.get(nucleotide);
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    Map<Character, Integer> nucleotideCounts() {
        return nucleotideCount;
    }


    private void initializeNucleotideCount() {
        nucleotideCount = new HashMap<>();
        nucleotideCount.put(A_SYMBOL, 0);
        nucleotideCount.put(C_SYMBOL, 0);
        nucleotideCount.put(G_SYMBOL, 0);
        nucleotideCount.put(T_SYMBOL, 0);
    }
    private void countNucleotides() {
        DNAString.chars().mapToObj(intCharacter -> (char) intCharacter).
                forEach(letter -> nucleotideCount.put(letter, nucleotideCount.get(letter) + 1));
    }
}
