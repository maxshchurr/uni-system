package students.system.model.student;

import java.util.Map;

public class Student {
    private String name;
    private String facultyNumber;
    private int course;
    private Specialization specialization;
    private Map<String, Integer> subjects;

    public Student(String name, String facultyNumber, int course, Specialization specialization, Map<String, Integer> subjects) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.course = course;
        this.specialization = specialization;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, Integer> subjects) {
        this.subjects = subjects;
    }
}


