package students.system.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import students.system.exceptions.student.StudentNotFoundException;
import students.system.model.intermidiate.AverageGradesRequest;
import students.system.model.intermidiate.EstimateRequest;
import students.system.model.intermidiate.StudentsCollection;
import students.system.model.student.Student;
import students.system.sevice.student.StudentService;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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

    @PostMapping("/deleteStudent/{facultyNumber}/{course}")
    public String deleteStudentByFacultyNumber(@PathVariable String facultyNumber, @PathVariable int course) throws StudentNotFoundException {
        studentService.deleteStudentByFacultyNumberAndCourse(facultyNumber, course);

        return "redirect:/studentsAll";
    }

    @GetMapping("/estimateStudentPage/{facultyNumber}/{course}")
    public String estimateStudentPage(Model model, @PathVariable String facultyNumber, @PathVariable int course) throws StudentNotFoundException {
        Student student = studentService.getStudentByFacultyNumberAndCourse(facultyNumber, course);

        String studentName = student.getName() + " " + student.getSurname();
        List<String> studentSubjects = student.getSubjectsToGrades()
                .keySet()
                .stream()
                .toList();

        EstimateRequest estimateRequest = new EstimateRequest(studentName, facultyNumber, course, studentSubjects);

        model.addAttribute("estimateRequest", estimateRequest);

        return "/estimateStudentPage";
    }

    @PostMapping("/estimateStudent")
    public String estimateStudent(@ModelAttribute("estimateRequest") EstimateRequest estimateRequest) throws StudentNotFoundException {
        studentService.getStudentByFacultyNumberAndCourse(estimateRequest.getFacultyNumber(), estimateRequest.getCourse())
                .getSubjectsToGrades()
                .replace(estimateRequest.getSubjectToEstimate(), estimateRequest.getGrade());

        return "redirect:/studentsAll";
    }

    @GetMapping("/editStudentPage/{facultyNumber}/{course}")
    public String editStudentPage(@PathVariable String facultyNumber, @PathVariable int course, Model model) throws StudentNotFoundException {
        Student student = studentService.getStudentByFacultyNumberAndCourse(facultyNumber, course);
        model.addAttribute("studentToEdit", student);

        return "/editStudentPage";
    }

    @PostMapping("/editStudent")
    public String editStudent(@ModelAttribute("studentToEdit") Student editedStudent) throws StudentNotFoundException {
        List<Student> existingStudents = studentService.getStudentsByFacultyNumber(editedStudent.getFacultyNumber());

        Set<Integer> courses = existingStudents.stream()
                .map(Student::getCourse)
                .collect(Collectors.toSet());

        if (!courses.contains(editedStudent.getCourse())) {
            studentService.createStudent(editedStudent);
            return "redirect:/studentsAll";
        }

        Student currentStudent = studentService.getStudentByFacultyNumberAndCourse(editedStudent.getFacultyNumber(), editedStudent.getCourse());
        currentStudent.setName(editedStudent.getName());
        currentStudent.setSurname(editedStudent.getSurname());

        return "redirect:/studentsAll";
    }

    @GetMapping("/getAverageGradesRequestPage")
    public String getAverageGrades(Model model) {
        model.addAttribute("averageGradesRequest", new AverageGradesRequest());

        return "/averageGradesRequestPage";
    }

    @PostMapping("/getAverageGradesRequest")
    public String getAverageGrades(@ModelAttribute("getAverageGradesRequestPage") AverageGradesRequest request, Model model) {
        List<Student> students = studentService.getStudentsBySpecializationAndCourse(request.getSpecialization(), request.getCourse());

        List<List<Integer>> grades = students.stream()
                .map(student -> student.getSubjectsToGrades().values().stream().filter(Objects::nonNull).toList())
                .toList();

        int sum = 0;
        int indexCounter = 0;
        for (List<Integer> grade : grades) {
            for (Integer integer : grade) {
                sum += integer;
                indexCounter++;
            }
        }

        double average = (double) sum / indexCounter;

        model.addAttribute("studentCollection", new StudentsCollection(students, average));
        return "/studentsCollectionPage";
    }

    @GetMapping("studentsCollectionPage")
    public String studentsCollectionPage() {
        return "/studentsCollectionPage";
    }
}
