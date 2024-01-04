package students.system.model.subject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubjectList {
    private Map<String, Integer> subjectsAndGrades;

    public SubjectList(Map<String, Integer> subjectsAndGrades) {
        this.subjectsAndGrades = subjectsAndGrades;
    }

    public SubjectList getSubjectsByCourse(int course) {
        Map<String, Integer> subjects = new HashMap<>();

        switch (course) {
            case 1 -> {
                List<String> yearOneSubject = Arrays.stream(SubjectsForYearOne.values())
                        .map(SubjectsForYearOne::getTitle)
                        .toList();
                yearOneSubject.forEach(subject -> subjects.put(subject, null));
                return new SubjectList(subjects);
            }
            case 2 -> {
                List<String> yearTwoSubject = Arrays.stream(SubjectsForYearTwo.values())
                        .map(SubjectsForYearTwo::getTitle)
                        .toList();
                yearTwoSubject.forEach(subject -> subjects.put(subject, null));
                return new SubjectList(subjects);
            }

            default -> throw new RuntimeException("No such course!");
        }
    }
}

enum SubjectsForYearOne{
    JAVA ("Java"),
    MATH ("Math"),
    BULGARIAN ("Bulgarian"),
    ENGLISH ("English"),
    LINEAR_ALGEBRA ("Linear algebra"),
    STATISTICS ("Statistics");

    private final String title;

    SubjectsForYearOne(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsForYearTwo{
    PYTHON ("Python"),
    PHYSICS("Physics"),
    COMPUTER_NETWORK("Computer network");

    private final String title;

    SubjectsForYearTwo(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}