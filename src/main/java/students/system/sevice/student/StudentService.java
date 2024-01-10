package students.system.sevice.student;

import org.springframework.stereotype.Service;
import students.system.exceptions.student.StudentNotFoundException;
import students.system.model.student.Student;
import students.system.model.subject.SubjectService;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();

    private final SubjectService subjectService;

    public StudentService(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentByFacultyNumber(String facultyNumber) throws StudentNotFoundException {
        return students.stream()
                .filter(student -> student.getFacultyNumber().equals(facultyNumber))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student with faculty number:" + facultyNumber + "not found"));
    }

    public Student createStudent(Student student) {
        student.setSubjectsToGrades(
                subjectService.getSubjectsBySpecializationAndTerm(student.getTerm(), student.getSpecialization())
        );

        students.add(student);

        return student;
    }

    public void deleteStudentByFacultyNumber(String facultyNumber) throws StudentNotFoundException {
        students.remove(getStudentByFacultyNumber(facultyNumber));
    }

    public List<Student> getStudentsBySpecialization(String specialization) {
        return students.stream()
                .filter(student -> student.getSpecialization().equals(specialization))
                .toList();
    }

    public List<Student> getStudentsByCourse(int course) {
        return students.stream()
                .filter(student -> student.getCourse() == course)
                .toList();
    }
}
