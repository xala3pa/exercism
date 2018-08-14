import static java.util.Optional.ofNullable;

class Twofer {
    String twofer(String name) {
      return  String.format("One for %s, one for me.", ofNullable(name).orElse("you"));
    }
}
