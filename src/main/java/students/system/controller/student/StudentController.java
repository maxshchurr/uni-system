package students.system.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import students.system.model.student.Student;
import students.system.sevice.student.StudentService;

import java.util.List;

@Controller
@RequestMapping("api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String getStudents(Model model) {
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);

        return "/studentsPage";
    }
}
