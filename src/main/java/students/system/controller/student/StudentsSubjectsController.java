package students.system.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import students.system.exceptions.student.StudentNotFoundException;
import students.system.model.intermidiate.EstimateRequest;
import students.system.model.student.Student;
import students.system.sevice.student.StudentService;

import java.util.List;
import java.util.Map;

@Controller
public class StudentsSubjectsController {

    private final StudentService studentService;

    public StudentsSubjectsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("studentsAll")
    public String getStudents(Model model) {
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);

        return "/studentsPage";
    }

    @GetMapping("createStudentPage")
    public String getCreateStudentPage(Model model) {
        model.addAttribute("studentToCreate", new Student());

        return "createStudentPage";
    }

    @PostMapping("/createStudent")
    public String createStudent(@ModelAttribute("studentToCreate") Student student) {
        studentService.createStudent(student);

        return "redirect:/studentsAll";
    }

    @PostMapping("/deleteStudent/{facultyNumber}")
    public String deleteStudentByFacultyNumber(@PathVariable String facultyNumber) throws StudentNotFoundException {
        studentService.deleteStudentByFacultyNumber(facultyNumber);

        return "redirect:/studentsAll";
    }

    @GetMapping("/estimateStudentPage/{facultyNumber}")
    public String estimateStudentPage(Model model, @PathVariable String facultyNumber) throws StudentNotFoundException {
        Student student = studentService.getStudentByFacultyNumber(facultyNumber);

        String studentName = student.getName() + " " + student.getSurname();
        List<String> studentSubjects = student.getSubjectsToGrades()
                .keySet()
                .stream()
                .toList();

        EstimateRequest estimateRequest = new EstimateRequest(studentName, facultyNumber, studentSubjects);

        model.addAttribute("estimateRequest", estimateRequest);

        return "/estimateStudentPage";
    }

    @PostMapping("/estimateStudent")
    public String estimateStudent(@ModelAttribute("estimateRequest") EstimateRequest estimateRequest) throws StudentNotFoundException {
        Map<String, Integer> subjectsToGrades = studentService.getStudentByFacultyNumber(estimateRequest.getFacultyNumber())
                .getSubjectsToGrades();

        subjectsToGrades.replace(estimateRequest.getSubjectToEstimate(), estimateRequest.getGrade());

        studentService.getStudents().stream()
                .filter(student -> student.getFacultyNumber().equals(estimateRequest.getFacultyNumber()))
                .findFirst()
                .map(it -> new Student(it, subjectsToGrades));

        return "redirect:/studentsAll";
    }
}
