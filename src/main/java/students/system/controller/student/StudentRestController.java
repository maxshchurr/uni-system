package students.system.controller.student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import students.system.exceptions.student.StudentNotFoundException;
import students.system.model.student.Student;
import students.system.sevice.student.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/rest/students")
public class StudentRestController {
    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{facultyNumber}")
    public Student getStudentByFacultyNumber(@PathVariable String facultyNumber) throws StudentNotFoundException {
        return studentService.getStudentByFacultyNumber(facultyNumber);
    }

    @GetMapping("/{specialization}")
    public List<Student> getStudentsBySpecialization(@PathVariable String specialization) {
        return studentService.getStudentsBySpecialization(specialization);
    }

    @GetMapping("/{course}")
    public List<Student> getStudentsByCourse(@PathVariable int course) {
        return studentService.getStudentsByCourse(course);
    }

    @DeleteMapping("/{facultyNumber}")
    public void deleteStudentByFacultyNumber(@PathVariable String facultyNumber) throws StudentNotFoundException {
        studentService.deleteStudentByFacultyNumber(facultyNumber);
    }
}
