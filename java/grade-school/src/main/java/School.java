import java.util.*;
import java.util.stream.Collectors;

public class School {
    private Map<Integer, List<String>> studentsArchive;

    public School() {
        this.studentsArchive = new HashMap<>();
    }

    public Map<Integer, List<String>> db() {
        return studentsArchive;
    }

    public List<String> grade(int grade) {
        return getStudentsByGrade(grade);
    }

    public void add(String name, int grade) {
        List<String> students = getStudentsByGrade(grade);

        students.add(name);
        Collections.sort(students);
        studentsArchive.put(grade, students);
    }

    public Map<Integer, List<String>> sort() {
        return studentsArchive.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private List<String> getStudentsByGrade(int grade) {
        List<String> students = studentsArchive.get(grade);
        return students != null ? students : new ArrayList<>();
    }
}
