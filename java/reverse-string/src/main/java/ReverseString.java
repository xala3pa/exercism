import java.util.function.BinaryOperator;

class ReverseString {

  private static final String EMPTY_CHARACTER = "";

  String reverse(String inputString) {
    return inputString.chars().mapToObj(ReverseString::getCharacter)
      .reduce(EMPTY_CHARACTER, concatenateAtTheEnd());
  }

  private BinaryOperator<String> concatenateAtTheEnd() {
    return (character1, character2) -> character2.concat(character1);
  }

  private static String getCharacter(int character) {
    return Character.toString((char) character);
  }
}