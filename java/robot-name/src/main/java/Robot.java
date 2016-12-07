import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

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

    private int getRandomNumber() {
        return random.nextInt(10);
    }

    private String getRandomUppercaseLetter() {
        char character = (char) (random.nextInt(26) + 'A');

        return String.valueOf(character);
    }

    private String generateRandomName() {
        StringBuilder name = new StringBuilder(5);

        IntStream.rangeClosed(1, 2)
                .forEach(i -> name.append(getRandomUppercaseLetter()));

        IntStream.rangeClosed(1, 3)
                .forEach(i -> name.append(getRandomNumber()));

        return name.toString();
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
