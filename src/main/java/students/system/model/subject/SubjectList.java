package students.system.model.subject;

import students.system.model.student.Specializations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectList {
    private Map<String, Integer> subjectsAndGrades;

    public SubjectList(Map<String, Integer> subjectsAndGrades) {
        this.subjectsAndGrades = subjectsAndGrades;
    }

    public SubjectList getSubjectsByCourse(int term, Specializations specialization) {
        Map<String, Integer> subjects = new HashMap<>();

        switch (specialization) {
            // if specialization == SOFTWARE_ENGINEERING
            case SOFTWARE_ENGINEERING -> {
                if (term == 1) {
                    List<String> term1SESubjects = Arrays.stream(SubjectsFor1TermSoftwareEngineering.values())
                            .map(SubjectsFor1TermSoftwareEngineering::getTitle)
                            .toList();
                    term1SESubjects.forEach(subject -> subjects.put(subject, null));
                    return new SubjectList(subjects);
                }
                if (term == 2) {
                    List<String> term2SESubjects = Arrays.stream(SubjectsFor2TermSoftwareEngineering.values())
                            .map(SubjectsFor2TermSoftwareEngineering::getTitle)
                            .toList();
                    term2SESubjects.forEach(subject -> subjects.put(subject, null));
                    return new SubjectList(subjects);
                }
                /*
                *
                *
                * MORE TERMS TO ADD
                *
                *
                * */
                else {
                    throw new RuntimeException("Unknown term in Software Engineering!");
                }

            }

            // if specialization == SOFTWARE_TECHNOLOGIES_AND_DESIGN
            case SOFTWARE_TECHNOLOGIES_AND_DESIGN -> {
                if (term==1){
                    List<String> term1STDSubjects = Arrays.stream(SubjectsFor1TermSoftwareTechnologiesAndDesign.values())
                            .map(SubjectsFor1TermSoftwareTechnologiesAndDesign::getTitle)
                            .toList();
                    term1STDSubjects.forEach(subject -> subjects.put(subject, null));
                    return new SubjectList(subjects);
                }
                if (term==2){
                    List<String> term2STDSubjects = Arrays.stream(SubjectsFor2TermSoftwareTechnologiesAndDesign.values())
                            .map(SubjectsFor2TermSoftwareTechnologiesAndDesign::getTitle)
                            .toList();
                    term2STDSubjects.forEach(subject -> subjects.put(subject, null));
                    return new SubjectList(subjects);
                }
                /*
                 *
                 *
                 * MORE TERMS TO ADD
                 *
                 *
                 * */
                else {
                    throw new RuntimeException("Unknown term in Software, Technologies and Design!");
                }
            }
            case BUSINESS_IT -> {
                if (term==1){
                    List<String> term1STDSubjects = Arrays.stream(SubjectsFor1TermBusinessIT.values())
                            .map(SubjectsFor1TermBusinessIT::getTitle)
                            .toList();
                    term1STDSubjects.forEach(subject -> subjects.put(subject, null));
                    return new SubjectList(subjects);
                }
                if (term==2){
                    List<String> term1STDSubjects = Arrays.stream(SubjectsFor2TermBusinessIT.values())
                            .map(SubjectsFor2TermBusinessIT::getTitle)
                            .toList();
                    term1STDSubjects.forEach(subject -> subjects.put(subject, null));
                    return new SubjectList(subjects);
                }

                else{
                    throw new RuntimeException("Unknown term in Business IT!");
                }
            }
            default -> throw new RuntimeException("No such specialization!");
        }
    }
}





// Subjects for different terms and different specializations



// Subjects for Software Engineering
enum SubjectsFor1TermSoftwareEngineering {
    PROGRAMMING ("Programming"),
    WEB_PROGRAMMING_1 ("Web Programming 1"),
    LINEAR_ALGEBRA_AND_ANALYTICAL_GEOMETRY ("Linear algebra and analytical geometry"),
    SPORTS ("Sports"),
    ENGLISH ("English"),
    OBJECT_ORIENTED_PROGRAMMING_1_JAVA ("Object Oriented Programming 1 (Java)");

    private final String title;

    SubjectsFor1TermSoftwareEngineering(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor2TermSoftwareEngineering {
    ALGORITHMS_AND_DATA_STRUCTURE ("Algorithms and data structures"),
    OBJECT_ORIENTED_PROGRAMMING_2("Object Oriented Programming 2"),
    MATHEMATICAL_ANALYSIS("Mathematical analysis"),
    SPORTS ("Sports"),
    DISCRETE_STRUCTURES ("Discrete structures"),
    SPECIALIZED_ENGLISH ("Specialized English");

    private final String title;

    SubjectsFor2TermSoftwareEngineering(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor3TermSoftwareEngineering {
    DATABASES ("Databases"),
    INTRODUCTION_TO_SOFTWARE_ENGINEERING("Introduction to Software Engineering"),
    SPORTS ("Sports"),
    WEB_PROGRAMMING_2("Web programming 2"),
    OPERATING_SYSTEMS_AND_COMPUTER_ARCHITECTURES ("Operating systems and computer architectures"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor3TermSoftwareEngineering(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor4TermSoftwareEngineering {
    PRACTICE_ON_OOP_AND_DB ("Practice on OOP and DB"),
    INTELLIGENT_SYSTEMS ("Intelligent systems"),
    COMPUTER_GRAPHICS_AND_GPI ("Computer graphics and GPI"),
    DISTRIBUTED_APPLICATIONS ("Distributed applications"),
    SPORTS ("Sports"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor4TermSoftwareEngineering(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor5TermSoftwareEngineering {
    MOBILE_APPS ("Mobile apps"),
    SOFTWARE_MODELING_AND_ANALYSIS ("Software modeling and analysis"),
    COMPUTER_NETWORKS_AND_COMMUNICATIONS ("Computer networks and communications"),
    PRACTICE_IN_THE_SPECIALITY ("Practice in the specialty"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor5TermSoftwareEngineering(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor6TermSoftwareEngineering {
    SOFTWARE_DESIGN_AND_ARCHITECTURES ("Software design and architectures"),
    INTERNET_TECHNOLOGIES ("Internet technologies"),
    PROBABILITY_AND_APPLIED_STATISTICS ("Probability and Applied Statistics"),
    ANALYSIS_OF_REQUIREMENTS_AND_SPECIFICATIONS ("Analysis of requirements and specifications"),
    PRACTICE_ON_SOFTWARE_TECHNOLOGIES ("Practice on software technologies"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor6TermSoftwareEngineering(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}



enum SubjectsFor7TermSoftwareEngineering {
    SOFTWARE_PROCESSES ("Software processes"),
    INTERNET_TECHNOLOGIES ("Internet technologies"),
    PROBABILITY_AND_APPLIED_STATISTICS ("Probability and Applied Statistics"),
    ANALYSIS_OF_REQUIREMENTS_AND_SPECIFICATIONS ("Analysis of requirements and specifications"),
    PRACTICE_ON_SOFTWARE_TECHNOLOGIES ("Practice on software technologies"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor7TermSoftwareEngineering(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor8TermSoftwareEngineering {
    INTERNSHIP ("Internship"),
    CYBERSECURITY_AND_SUSTAINABLE_BUSINESS ("Cybersecurity and sustainable business"),
    PARALLEL_PROGRAMMING ("Parallel programming"),
    SOFTWARE_VERIFICATION_AND_VALIDATION ("Software verification and validation"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1");

    private final String title;

    SubjectsFor8TermSoftwareEngineering(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}





// Subjects for Software, Technologies and Design
enum SubjectsFor1TermSoftwareTechnologiesAndDesign {
    INTRODUCTION_TO_PROGRAMMING_C_SHARP ("Introduction to Programming (C#)"),
    INTRODUCTION_TO_INFORMATION_TECHNOLOGY ("Introduction to Information Technology"),
    LINEAR_ALGEBRA_AND_ANALYTICAL_GEOMETRY ("Linear algebra and analytical geometry"),
    INTRODUCTION_TO_WEB_PROGRAMMING ("Introduction to Web Programming"),
    SPORTS ("Sports"),
    ENGLISH ("ENGLISH");

    private final String title;

    SubjectsFor1TermSoftwareTechnologiesAndDesign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor2TermSoftwareTechnologiesAndDesign {
    CREATING_A_GPI_C_SHARP ("Creating a GPI (C#)"),
    SOFTWARE_SYSTEMS_IN_MATHEMATICS ("Software systems in mathematics"),
    OBJECT_ORIENTED_PROGRAMMING_C_SHARP ("Object Oriented Programming (C#)"),
    BASICS_OF_GRAPHIC_DESIGN ("Basics of graphic design"),
    WEB_DESIGN ("Web design"),
    SPECIALIZED_ENGLISH ("Specialized English"),
    SPORTS ("Sports");

    private final String title;

    SubjectsFor2TermSoftwareTechnologiesAndDesign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor3TermSoftwareTechnologiesAndDesign {
    DATABASES ("Databases"),
    EVENT_PROGRAMMING ("Event programming"),
    APPLIED_MATHEMATICS_1 ("Applied Mathematics 1"),
    SOFTWARE_TECHNOLOGIES_1 ("Software technologies 1"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2"),
    SPORTS ("Sports");

    private final String title;

    SubjectsFor3TermSoftwareTechnologiesAndDesign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}



enum SubjectsFor4TermSoftwareTechnologiesAndDesign {
    ADMINISTRATION_OF_DYNAMIC_WEB_SYSTEMS ("Administration of dynamic web systems"),
    GEOMETRIC_DESIGN ("Geometric design"),
    JAVA_PROGRAMMING ("JAVA programming"),
    DIGITAL_IMAGE_PROCESSING ("Digital image processing"),
    PROGRAMMING_ON_THE_INTERNET_WITH_PHP_AND_MYSQL ("Programming on the Internet with PHP and MySQL"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2"),
    SPORTS ("Sports");

    private final String title;

    SubjectsFor4TermSoftwareTechnologiesAndDesign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


// Subjects for Business IT
enum SubjectsFor1TermBusinessIT {
    PYTHON ("Python"),
    PHYSICS("Physics"),
    COMPUTER_NETWORK("Computer network");

    private final String title;

    SubjectsFor1TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor2TermBusinessIT {
    PYTHON ("Python"),
    PHYSICS("Physics"),
    COMPUTER_NETWORK("Computer network");

    private final String title;

    SubjectsFor2TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}