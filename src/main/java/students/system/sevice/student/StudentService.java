package students.system.sevice.student;

import org.springframework.stereotype.Service;
import students.system.model.student.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }


    public Student getStudentByNumber(int number){
        return null;
    }

    public Student addStudent(Student student) {
        return null;
    }

    public void deleteStudent(Student student){

    }

    // stream.filter() NADO
    public List<Student> getStudentsByFaculty(String faculty) {
        return null;
    }

    // stream.filter() NADO
    public List<Student> getStudentsByCourse(int course) {
        return null;
    }


}
