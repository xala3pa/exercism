import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {

  private String acronym;

  Acronym(String phrase) {
    String[] words = phrase.split("\\W+");
    acronym = Arrays.stream(words)
      .map(word -> word.charAt(0))
      .map(character -> character.toString().toUpperCase())
      .collect(Collectors.joining());
  }

  String get() {
    return acronym;
  }
}
