import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Robot {
    private String name;
    private Random random = new Random();
    private static List<String> nameList = new ArrayList<>();

    public Robot() {
        this.name = getUniqueName();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        this.name = getUniqueName();
    }

    private String generateRandomName() {
        Stream<String> chars = random.ints(2, 'A', 'Z' + 1).mapToObj(i -> String.valueOf((char)i));
        Stream<String> ints = random.ints(3, 0, 10).mapToObj(Integer::toString);
        return Stream.concat(chars, ints).collect(Collectors.joining());
    }

    private String getUniqueName() {
        String name = generateRandomName();
        if (nameList.contains(name)) {
            return getUniqueName();
        }
        nameList.add(name);
        return name;
    }
}
