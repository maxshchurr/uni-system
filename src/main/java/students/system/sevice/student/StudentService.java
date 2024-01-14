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

    public Student getStudentByFacultyNumberAndCourse(String facultyNumber, int course) throws StudentNotFoundException {
        return students.stream()
                .filter(student -> student.getFacultyNumber().equals(facultyNumber) && student.getCourse() == course)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student with faculty number: " + facultyNumber + " not found"));
    }

    public List<Student> getStudentsByFacultyNumber(String facultyNumber) {
        return students.stream()
                .filter(student -> student.getFacultyNumber().equals(facultyNumber))
                .toList();
    }

    public void createStudent(Student student) {
        student.setSubjectsToGrades(
                subjectService.getSubjectsBySpecializationAndCourse(student.getCourse(), student.getSpecialization())
        );

        students.add(student);
    }

    public void deleteStudentByFacultyNumberAndCourse(String facultyNumber, int course) throws StudentNotFoundException {
        students.remove(getStudentByFacultyNumberAndCourse(facultyNumber, course));
    }

    public List<Student> getStudentsBySpecializationAndCourse(String specialization, int course) {
        return students.stream()
                .filter(student -> student.getSpecialization().equals(specialization) && student.getCourse() == course)
                .toList();
    }
}
