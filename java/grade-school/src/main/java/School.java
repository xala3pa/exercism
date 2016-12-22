import java.util.*;

public class School {
    private Map<Integer, List<String>> studentsArchive;

    public School() {
        this.studentsArchive = new TreeMap<>();
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
        studentsArchive.put(grade, students);
    }

    public Map<Integer, List<String>> sort() {
        studentsArchive.values().forEach(Collections::sort);
        return studentsArchive;
    }

    private List<String> getStudentsByGrade(int grade) {
        studentsArchive.putIfAbsent(grade, new ArrayList<>());
        return studentsArchive.get(grade);
    }
}
