package students.system.model.intermidiate;

import java.util.List;

public class EstimateRequest {
    private String studentName;
    private String facultyNumber;
    private int course;
    private List<String> subjects;
    private String subjectToEstimate;
    private int grade;

    public EstimateRequest(String studentName, String facultyNumber, int course, List<String> subjects) {
        this.studentName = studentName;
        this.facultyNumber = facultyNumber;
        this.course = course;
        this.subjects = subjects;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getSubjectToEstimate() {
        return subjectToEstimate;
    }

    public void setSubjectToEstimate(String subjectToEstimate) {
        this.subjectToEstimate = subjectToEstimate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
