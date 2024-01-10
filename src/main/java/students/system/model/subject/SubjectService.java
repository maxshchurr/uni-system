package students.system.model.subject;

import org.springframework.stereotype.Service;
import students.system.model.student.Specialization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static students.system.subject_data.SubjectData.*;

@Service
public class SubjectService {

    public Map<String, Integer> getSubjectsByCourse(int term, Specialization specialization) {
        Map<String, Integer> subjects = new HashMap<>();

        return null;
    }
}
