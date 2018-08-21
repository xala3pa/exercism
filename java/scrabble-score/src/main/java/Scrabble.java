import java.util.Map;

class Scrabble {

  private String word;
  private static final int NO_SCORE = 0;
  private static Map<String, Integer> dictionary =
    Map.ofEntries(
      Map.entry("A", 1),
      Map.entry("B", 3),
      Map.entry("C", 3),
      Map.entry("D", 2),
      Map.entry("E", 1),
      Map.entry("F", 4),
      Map.entry("G", 2),
      Map.entry("H", 4),
      Map.entry("I", 1),
      Map.entry("J", 8),
      Map.entry("K", 5),
      Map.entry("L", 1),
      Map.entry("M", 3),
      Map.entry("N", 1),
      Map.entry("O", 1),
      Map.entry("P", 3),
      Map.entry("Q", 10),
      Map.entry("R", 1),
      Map.entry("S", 1),
      Map.entry("T", 1),
      Map.entry("U", 1),
      Map.entry("V", 4),
      Map.entry("W", 4),
      Map.entry("X", 8),
      Map.entry("Y", 4),
      Map.entry("Z", 10)
    );

  Scrabble(String word) {
    this.word = word.toUpperCase();
  }

  int getScore() {
    return word.chars()
      .map(character -> dictionary.get(getLetter(character)))
      .reduce(Integer::sum).orElse(NO_SCORE);
  }

  private String getLetter(int character) {
    return String.valueOf((char)character);
  }
}
