package students.system.sevice.student;

import org.springframework.stereotype.Service;
import students.system.exceptions.student.StudentNotFoundException;
import students.system.model.student.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentByFacultyNumber(String facultyNumber) throws StudentNotFoundException {
        return students.stream()
                .filter(student -> student.getFacultyNumber().equals(facultyNumber))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student with faculty number:" + facultyNumber + "not found"));
    }

    public Student addStudent(Student student) {
        students.add(student);

        return student;
    }

    public void deleteStudentByFacultyNumber(String facultyNumber) throws StudentNotFoundException {
        students.remove(getStudentByFacultyNumber(facultyNumber));
    }

    public List<Student> getStudentsBySpecialization(String specialization) {
        return students.stream()
                .filter(student -> student.getSpecialization().getTitle().equals(specialization))
                .toList();
    }

    public List<Student> getStudentsByCourse(int course) {
        return students.stream()
                .filter(student -> student.getCourse() == course)
                .toList();
    }
}
