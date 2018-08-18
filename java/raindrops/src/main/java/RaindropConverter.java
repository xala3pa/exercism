import java.util.Map;

class RaindropConverter {

  private static final String PLING = "Pling";
  private static final String PLANG = "Plang";
  private static final String PLONG = "Plong";

  private static Map<Integer, String> mapping =
    Map.of(3, PLING, 5, PLANG, 7, PLONG);

  String convert(int number) {

    return mapping.keySet().stream()
      .sorted()
      .filter(divisor -> number % divisor == 0)
      .map(mapping::get)
      .reduce(String::concat)
      .orElse(String.valueOf(number));
  }

}
