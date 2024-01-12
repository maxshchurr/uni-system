package students.system.model.student;

import java.util.Map;

public class Student {
    private String name;
    private String surname;
    private String facultyNumber;
    private int course;
    private int term;
    private String specialization;
    private Map<String, Integer> subjectsToGrades;

    public Student() {
    }

    public Student(Student student, Map<String, Integer> estimatedSubjectToGrades) {
        name = student.getName();
        surname = student.getSurname();
        facultyNumber = student.getFacultyNumber();
        course = student.getCourse();
        term = student.getTerm();
        specialization = student.getSpecialization();
        subjectsToGrades = estimatedSubjectToGrades;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Map<String, Integer> getSubjectsToGrades() {
        return subjectsToGrades;
    }

    public void setSubjectsToGrades(Map<String, Integer> subjectsToGrades) {
        this.subjectsToGrades = subjectsToGrades;
    }
}


