package students.system.exceptions.student;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
