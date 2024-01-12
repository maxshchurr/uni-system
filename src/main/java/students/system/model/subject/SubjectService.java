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
        Specialization valueOf = Specialization.valueOf(specialization.toUpperCase().replace(' ', '_'));

        switch (valueOf) {
            case SOFTWARE_ENGINEERING -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermSoftwareEngineering(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermSoftwareEngineering(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermSoftwareEngineering(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermSoftwareEngineering(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermSoftwareEngineering(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermSoftwareEngineering(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermSoftwareEngineering(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermSoftwareEngineering(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Software Engineering specialization!");
                }
            }
            case SOFTWARE_TECHNOLOGIES_AND_DESIGN -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermSoftwareTechnologiesAndDesign(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Software Technologies and Design specialization!");
                }
            }
            case BUSINESS_IT -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermBusinessIT(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermBusinessIT(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermBusinessIT(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermBusinessIT(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermBusinessIT(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermBusinessIT(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermBusinessIT(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermBusinessIT(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Business IT specialization!");
                }
            }
            case INFORMATICS -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermInformatics(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermInformatics(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermInformatics(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermInformatics(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermInformatics(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermInformatics(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermInformatics(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermInformatics(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Informatics specialization!");
                }
            }
            case MATHEMATICS -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermMathematics(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermMathematics(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermMathematics(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermMathematics(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermMathematics(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermMathematics(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermMathematics(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermMathematics(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Mathematics specialization!");
                }
            }
            case MATHEMATICS_INFORMATICS_AND_INFORMATION_TECHNOLOGIES -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermMathematicsInformaticsAndIT(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermMathematicsInformaticsAndIT(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermMathematicsInformaticsAndIT(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermMathematicsInformaticsAndIT(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermMathematicsInformaticsAndIT(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermMathematicsInformaticsAndIT(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermMathematicsInformaticsAndIT(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermMathematicsInformaticsAndIT(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Mathematics, Informatics and Information Technologies specialization!");
                }
            }
            case APPLIED_MATHEMATICS -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermAppliedMathematics(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermAppliedMathematics(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermAppliedMathematics(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermAppliedMathematics(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermAppliedMathematics(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermAppliedMathematics(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermAppliedMathematics(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermAppliedMathematics(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Applied Mathematics specialization!");
                }
            }
            case BUSINESS_MATHEMATICS -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermBusinessMathematics(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermBusinessMathematics(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermBusinessMathematics(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermBusinessMathematics(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermBusinessMathematics(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermBusinessMathematics(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermBusinessMathematics(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermBusinessMathematics(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Business Mathematics specialization!");
                }
            }
            case INFORMATION_TECHNOLOGY_MATHEMATICS_AND_EDUCATIONAL_MANAGEMENT -> {
                if (term == 1) {
                    fillSubjectsGradesWithValues(subjectsFor1TermITMathematicsAndEducationalManagement(), subjectsToGrades);
                } else if (term == 2) {
                    fillSubjectsGradesWithValues(subjectsFor2TermITMathematicsAndEducationalManagement(), subjectsToGrades);
                }
                else if (term == 3) {
                    fillSubjectsGradesWithValues(subjectsFor3TermITMathematicsAndEducationalManagement(), subjectsToGrades);
                }
                else if (term == 4) {
                    fillSubjectsGradesWithValues(subjectsFor4TermITMathematicsAndEducationalManagement(), subjectsToGrades);
                }
                else if (term == 5) {
                    fillSubjectsGradesWithValues(subjectsFor5TermITMathematicsAndEducationalManagement(), subjectsToGrades);
                }
                else if (term == 6) {
                    fillSubjectsGradesWithValues(subjectsFor6TermITMathematicsAndEducationalManagement(), subjectsToGrades);
                }
                else if (term == 7) {
                    fillSubjectsGradesWithValues(subjectsFor7TermITMathematicsAndEducationalManagement(), subjectsToGrades);
                }
                else if (term == 8) {
                    fillSubjectsGradesWithValues(subjectsFor8TermITMathematicsAndEducationalManagement(), subjectsToGrades);
                }
                else {
                    throw new RuntimeException("No such term " + term + " for Information Technology, Mathematics and Educational Management specialization!");
                }
            }
            default -> throw new RuntimeException("No such specialization: " + specialization);
        }

        return subjectsToGrades;
    }

    private void fillSubjectsGradesWithValues(List<String> subjects, Map<String, Integer> subjectsToGrades) {
        subjects.forEach(it -> subjectsToGrades.put(it, null));
    }
}
