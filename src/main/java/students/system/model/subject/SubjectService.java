package students.system.model.subject;

import org.springframework.stereotype.Service;
import students.system.model.student.Specialization;

import java.util.HashMap;
import java.util.Map;

import static students.system.subject_data.SubjectData.*;

@Service
public class SubjectService {

    public Map<String, Integer> getSubjectsBySpecializationAndCourse(int course, String specialization) {
        Map<String, Integer> subjectsToGrades = new HashMap<>();
        Specialization spec = Specialization.valueOf(specialization.toUpperCase().replace(' ', '_'));

        switch (spec) {
            case SOFTWARE_ENGINEERING -> {
                if (course == 1) {
                    subjectsFor1CourseSoftwareEngineering().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2CourseSoftwareEngineering().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermSoftwareEngineering().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermSoftwareEngineering().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Software Engineering specialization!");
                }
            }
            case SOFTWARE_TECHNOLOGIES_AND_DESIGN -> {
                if (course == 1) {
                    subjectsFor1TermSoftwareTechnologiesAndDesign().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2TermSoftwareTechnologiesAndDesign().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermSoftwareTechnologiesAndDesign().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermSoftwareTechnologiesAndDesign().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Software Technologies and Design specialization!");
                }
            }
            case BUSINESS_IT -> {
                if (course == 1) {
                    subjectsFor1TermBusinessIT().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2TermBusinessIT().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermBusinessIT().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermBusinessIT().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Business IT specialization!");
                }
            }
            case INFORMATICS -> {
                if (course == 1) {
                    subjectsFor1TermInformatics().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2TermInformatics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermInformatics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermInformatics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Informatics specialization!");
                }
            }
            case MATHEMATICS -> {
                if (course == 1) {
                    subjectsFor1TermMathematics().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2TermMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Mathematics specialization!");
                }
            }
            case MATHEMATICS_INFORMATICS_AND_INFORMATION_TECHNOLOGIES -> {
                if (course == 1) {
                    subjectsFor1TermMathematicsInformaticsAndIT().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2TermMathematicsInformaticsAndIT().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermMathematicsInformaticsAndIT().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermMathematicsInformaticsAndIT().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Mathematics, Informatics and Information Technologies specialization!");
                }
            }
            case APPLIED_MATHEMATICS -> {
                if (course == 1) {
                    subjectsFor1TermAppliedMathematics().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2TermAppliedMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermAppliedMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermAppliedMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Applied Mathematics specialization!");
                }
            }
            case BUSINESS_MATHEMATICS -> {
                if (course == 1) {
                    subjectsFor1TermBusinessMathematics().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2TermBusinessMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermBusinessMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermBusinessMathematics().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Business Mathematics specialization!");
                }
            }
            case INFORMATION_TECHNOLOGY_MATHEMATICS_AND_EDUCATIONAL_MANAGEMENT -> {
                if (course == 1) {
                    subjectsFor1TermITMathematicsAndEducationalManagement().forEach(it -> subjectsToGrades.put(it, null));
                } else if (course == 2) {
                    subjectsFor2TermITMathematicsAndEducationalManagement().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 3) {
                    subjectsFor3TermITMathematicsAndEducationalManagement().forEach(it -> subjectsToGrades.put(it, null));
                }
                else if (course == 4) {
                    subjectsFor4TermITMathematicsAndEducationalManagement().forEach(it -> subjectsToGrades.put(it, null));
                }
                else {
                    throw new RuntimeException("No such term " + course + " for Information Technology, Mathematics and Educational Management specialization!");
                }
            }
            default -> throw new RuntimeException("No such specialization: " + specialization);
        }

        return subjectsToGrades;
    }
}
