package students.system.model.student;

import students.system.model.subject.SubjectList;

import java.util.List;

public class Student {
    private String name;
    private String facultyNumber;
    private int course;
    private String specialization;
    private SubjectList subjects;

    public Student(String name, String facultyNumber, int course, String specialization, SubjectList subjects) {
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public SubjectList getSubjects() {
        return subjects;
    }

    public void setSubjects(SubjectList subjects) {
        this.subjects = subjects;
    }
}
