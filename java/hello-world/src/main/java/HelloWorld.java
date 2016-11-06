public class HelloWorld {
    public static String hello(String name) {

    return String.format("Hello, %s!", printName(name));
    }

    private static String printName(String name) {
        return isBlank(name) ? "World" : name;
    }


    private static boolean isBlank(String name) {
        return name == null || name.isEmpty();
    }
}
