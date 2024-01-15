package students.system.model.intermidiate;

import students.system.model.student.Student;

import java.util.List;

public class StudentsCollection {
    private List<Student> students;
    private String averageGrade;

    public StudentsCollection(List<Student> students, String averageGrade) {
        this.students = students;
        this.averageGrade = averageGrade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(String averageGrade) {
        this.averageGrade = averageGrade;
    }
}
