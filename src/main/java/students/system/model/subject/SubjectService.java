package students.system.model.subject;

import org.springframework.stereotype.Service;
import students.system.model.student.Specialization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static students.system.subject_data.SubjectData.*;

@Service
public class SubjectService {

    public Map<String, Integer> getSubjectsBySpecializationAndTerm(int term, String specialization) {
        Map<String, Integer> subjectsToGrades = new HashMap<>();
        String tmp = specialization.toUpperCase().replace(' ', '_');
        Specialization valueOf = Specialization.valueOf(tmp);

        switch (valueOf) {
            case SOFTWARE_ENGINEERING -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermSoftwareEngineering(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermSoftwareEngineering(), subjectsToGrades);
                }
                // ... more terms
            }
            case SOFTWARE_TECHNOLOGIES_AND_DESIGN -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                }
                // ... more terms
            }

            // ... more specializations
        }

        return subjectsToGrades;
    }

    private void fillSubjectsGradesWithValues(List<String> subjects, Map<String, Integer> subjectsToGrades) {
        subjects.forEach(it -> subjectsToGrades.put(it, null));
    }
}
