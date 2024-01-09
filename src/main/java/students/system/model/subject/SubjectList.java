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


enum SubjectsFor5TermSoftwareTechnologiesAndDesign {
    PUBLISHING_SYSTEMS ("Publishing systems"),
    PRACTICE_IN_THE_SPECIALTY ("Practice in the specialty"),
    VIDEO_AND_ANIMATION_CREATION_AND_PROCESSING ("Video and animation creation and processing"),
    SOFTWARE_TECHNOLOGIES ("Software technologies 2"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor5TermSoftwareTechnologiesAndDesign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor6TermSoftwareTechnologiesAndDesign {
    CREATION_AND_PROCESSING_OF_VECTOR_IMAGES ("Creation and processing of vector images"),
    COMPUTER_NETWORKS_AND_COMMUNICATIONS ("Computer networks and communications"),
    MOBILE_APPLICATION_DESIGN ("Mobile application design"),
    MOBILE_APPLICATION_PROGRAMMING ("Mobile application programming"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor6TermSoftwareTechnologiesAndDesign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor7TermSoftwareTechnologiesAndDesign {
    E_COMMERCE ("E-commerce"),
    MODEL_DESIGN_3D ("3D model design"),
    APPLIED_MATHEMATICS ("Applied mathematics 2"),
    INFORMATION_TECHNOLOGIES_ON_THE_INTERNET ("Information technologies on the Internet"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor7TermSoftwareTechnologiesAndDesign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor8TermSoftwareTechnologiesAndDesign {
    FRAMEWORK_SYSTEMS_FOR_WEB_PROGRAMMING ("Framework systems for web programming"),
    BUSINESS_INFORMATION_SYSTEMS ("Business information systems"),
    INTERNSHIP ("Internship"),
    OPTIONAL_DISCIPLINE("Optional discipline");

    private final String title;

    SubjectsFor8TermSoftwareTechnologiesAndDesign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}




// Subjects for Business IT

enum SubjectsFor1TermBusinessIT {
    INTRODUCTION_TO_COMPUTER_SCIENCE ("Introduction to Computer Science"),
    INTRODUCTION_TO_INFORMATION_TECHNOLOGY("Introduction to Information Technology"),
    LINEAR_ALGEBRA_AND_ANALYTICAL_GEOMETRY("Linear algebra and analytical geometry"),
    PROGRAMMING("Programming"),
    LAW_AND_LEGAL_INFORMATION_SYSTEMS("Law and legal information systems"),
    ENGLISH("English"),
    SPORTS("Sports");

    private final String title;

    SubjectsFor1TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor2TermBusinessIT {
    OOP ("Object oriented programming"),
    INFORMATION_TECHNOLOGY_IN_MATHEMATICS("Information technology in mathematics"),
    BANKING_AND_BANKING_INFORMATION_SYSTEMS("Banking and banking information systems"),
    APPLIED_MATHEMATICS("Applied Mathematics"),
    GRAPHICS_AND_PRESENTATIONS("Graphics and presentations"),
    SPECIALIZED_ENGLISH("Specialized English"),
    SPORTS("Sports");

    private final String title;

    SubjectsFor2TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor3TermBusinessIT {
    PROGRAMMING_USING_DOT_NET ("Programming using .NET"),
    MARKETING_AND_MARKETING_INFORMATION_SYSTEMS ("Marketing and marketing information systems"),
    FINANCIAL_MATHEMATICS ("Financial mathematics"),
    INSURANCE_MATHEMATICS ("Insurance Mathematics"),
    INFORMATION_TECHNOLOGIES_ON_THE_INTERNET ("Information technologies on the Internet"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2"),
    SPORTS("Sports");

    private final String title;

    SubjectsFor3TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor4TermBusinessIT {
    ECONOMETRICS ("Econometrics"),
    PROGRAMMING_ON_THE_INTERNET_WITH_PHP_AND_MYSQL("Programming on the Internet with PHP and MySQL"),
    DATABASES("Databases"),
    ACCOUNTING_AND_ACCOUNTING_INFORMATION_SYSTEMS("Accounting and accounting information systems"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2"),
    SPORTS("Sports");

    private final String title;

    SubjectsFor4TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor5TermBusinessIT {
    JAVA_PROGRAMMING ("JAVA programming"),
    SOFTWARE_TECHNOLOGIES("Software technologies"),
    INTRODUCTION_TO_CLOUD_TECHNOLOGIES("Introduction to Cloud Technologies"),
    PRACTICE_IN_THE_SPECIALTY("Practice in the specialty"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor5TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor6TermBusinessIT {
    MODELING_AND_MANAGEMENT_OF_BUSINESS_PROCESSES ("Modeling and management of business processes"),
    COMPUTER_NETWORKS_AND_COMMUNICATIONS("Computer networks and communications"),
    INVESTMENTS_AND_INVESTMENT_TECHNIQUES("Investments and investment techniques"),
    WEB_DESIGN("Web design"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor6TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor7TermBusinessIT {
    OPTIMIZATION_MODELS_IN_ECONOMICS ("Optimization models in economics"),
    E_COMMERCE("E-commerce"),
    INSURANCE_AND_INSURANCE_INFORMATION_SYSTEMS("Insurance and insurance information systems"),
    BUSINESS_ENGLISH_WITH_INFORMATION_TECHNOLOGY("Business English with Information Technology"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");

    private final String title;

    SubjectsFor7TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor8TermBusinessIT {
    BUSINESS_INFORMATION_SYSTEMS ("Business information systems"),
    ANALYSIS_OF_INVESTMENT_PROJECTS("Analysis of investment projects"),
    EXCHANGE_OF_INVESTMENT_PROJECTS("Exchange and OTC trading"),
    PUBLISHING_SYSTEMS("Publishing systems"),
    BUSINESS_IT("Business IT"),
    INTERNSHIP("Internship"),
    OPTIONAL_DISCIPLINE("Optional discipline");

    private final String title;

    SubjectsFor8TermBusinessIT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


// Subjects for Informatics

enum SubjectsFor1TermInformatics {
    INTRODUCTION_TO_COMPUTER_SCIENCE_C_PLUS_PLUS ("Introduction to Computer Science (C++)"),
    LINEAR_ALGEBRA_AND_ANALYTICAL_GEOMETRY("Linear algebra and analytical geometry"),
    ENGLISH("English"),
    SPORTS("Sports"),
    PROGRAMMING_C_PLUS_PLUS("Programming (C++)");

    private final String title;

    SubjectsFor1TermInformatics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor2TermInformatics {
    OPERATING_SYSTEMS ("Operating Systems"),
    JAVA_PROGRAMMING("Java programming"),
    MATHEMATICAL_ANALYSIS("Mathematical analysis"),
    INFORMATION_TECHNOLOGY("Information Technology"),
    SPECIALIZED_ENGLISH("Specialized English"),
    SPORTS("Sports");

    private final String title;

    SubjectsFor2TermInformatics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor3TermInformatics {
    WEB_PROGRAMMING_HTML_CSS_JS ("Web Programming (HTML, CSS, JS)"),
    MODELS_OF_REAL_PROCESSES ("Models of real processes"),
    OOP_JAVA ("Object Oriented Programming (Java)"),
    DATABASES("Databases"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2"),
    SPORTS("Sports");

    private final String title;

    SubjectsFor3TermInformatics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor4TermInformatics {
    COMPUTER_ARCHITECTURES ("Computer architectures"),
    SOFTWARE_TECHNOLOGIES ("Software technologies"),
    DISCRETE_MATH("Discrete math"),
    PRACTICE_ON_OOP_AND_DB("Practice on OOP and DB"),
    GEOMETRY("Geometry"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2"),
    SPORTS("Sports");

    private final String title;

    SubjectsFor4TermInformatics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor5TermInformatics {
    DISTRIBUTED_APPLICATIONS_C_SHARP ("Distributed Applications (C#)"),
    ALGORITHMS_AND_DATA_STRUCTURES_C_SHARP ("Algorithms and Data Structures (C#)"),
    COMPUTER_NETWORKS_AND_COMMUNICATIONS("Computer networks and communications"),
    PRACTICE_IN_THE_SPECIALTY("Practice in the specialty"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");
    private final String title;

    SubjectsFor5TermInformatics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor6TermInformatics {
    AI ("AI"),
    DESIGN_PATTERNS ("Design Patterns"),
    PRACTICE_ON_SOFTWARE_TECHNOLOGIES("Practice on software technologies"),
    COMPUTER_GRAPHICS("Computer Graphics"),
    PROBABILITY_AND_APPLIED_STATISTICS("Probability and Applied Statistics"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");
    private final String title;

    SubjectsFor6TermInformatics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor7TermInformatics {
    WEB_SERVER_LANGUAGE ("Web server languages"),
    COMPUTER_NUMERICAL_METHODS ("Computer Numerical Methods"),
    TRANSLATION_METHODS("Translation methods"),
    INFORMATION_MODELING_C_SHARP("Information Modeling (C#)"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");
    private final String title;

    SubjectsFor7TermInformatics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor8TermInformatics {
    INTERNSHIP ("Internship"),
    PROJECT_MANAGEMENT ("Project management"),
    SOFTWARE_QA("Software Quality Assurance (QA)"),
    COMPUTATIONAL_LINGUISTICS("Computational Linguistics"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1");
    private final String title;

    SubjectsFor8TermInformatics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}



// Subjects for Mathematics

enum SubjectsFor1TermMathematics {
    LINEAR_ALGEBRA ("Linear algebra"),
    PROGRAMMING ("Programming"),
    MATHEMATICAL_ANALYSIS_1("Mathematical analysis 1"),
    ENGLISH("English"),
    SPORTS("Sports");
    private final String title;

    SubjectsFor1TermMathematics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor2TermMathematics {
    ANALYTICAL_GEOMETRY ("Analytical geometry"),
    MATHEMATICAL_ANALYSIS_2 ("Mathematical analysis 2"),
    OOP("Object oriented programming"),
    OPERATING_SYSTEMS("Operating Systems"),
    SPECIALIZED_ENGLISH("Specialized English"),
    SPORTS("Sports");
    private final String title;

    SubjectsFor2TermMathematics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

enum SubjectsFor3TermMathematics {
    MATHEMATICAL_ANALYSIS_3 ("Mathematical analysis 3"),
    DISCRETE_MATH ("Discrete math"),
    IT ("Information Technology"),
    ALGEBRA_1("Algebra 1"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2"),
    SPORTS("Sports");
    private final String title;

    SubjectsFor3TermMathematics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor4TermMathematics {
    MATHEMATICAL_ANALYSIS_4 ("Mathematical analysis 4"),
    PROBABILITY_THEORY ("Probability theory"),
    COMPLEX_ANALYSIS ("Complex analysis"),
    ALGEBRA_2 ("Algebra 2"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2"),
    SPORTS("Sports");
    private final String title;

    SubjectsFor4TermMathematics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor5TermMathematics {
    FUNCTIONAL_ANALYSIS ("Functional analysis"),
    MATHEMATICAL_STATISTICS ("Mathematical statistics"),
    DISCRETE_GEOMETRY_STRUCTURES ("Discrete geometric structures"),
    ORDINARY_DIFFERENTIAL_EQUATIONS ("Ordinary differential equations"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");
    private final String title;

    SubjectsFor5TermMathematics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor6TermMathematics {
    PARTIAL_DIFFERENTIAL_EQUATIONS ("Partial differential equations"),
    NUMERICAL_METHODS ("Numerical methods"),
    DIFFERENTIAL_GEOMETRY ("Differential geometry"),
    DATABASES ("Databases"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");
    private final String title;

    SubjectsFor6TermMathematics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor7TermMathematics {
    MATHEMATICAL_OPTIMIZATION ("Mathematical optimization"),
    LATEX_PUBLISHING_SYSTEM ("Latex publishing system"),
    SYNTHETIC_GEOMETRY ("Synthetic geometry"),
    OPTIONAL_DISCIPLINE_1 ("Optional discipline 1"),
    OPTIONAL_DISCIPLINE_2 ("Optional discipline 2");
    private final String title;

    SubjectsFor7TermMathematics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor8TermMathematics {
    GAME_THEORY ("Game theory"),
    NUMBER_THEORY ("Number theory"),
    OPTIONAL_DISCIPLINE ("Optional discipline");
    private final String title;

    SubjectsFor8TermMathematics(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}



enum SubjectsFor1TermMathematicsInformaticsAndInformationTechnologies {
    LINEAR_ALGEBRA ("Linear algebra"),
    PROGRAMMING ("Programming"),
    MATHEMATICAL_ANALYSIS_1 ("Mathematical analysis 1"),
    INFORMATION_TECHNOLOGY ("Information Technology"),
    ENGLISH ("English"),
    SPORTS ("Sports"),;
    private final String title;

    SubjectsFor1TermMathematicsInformaticsAndInformationTechnologies(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor2TermMathematicsInformaticsAndInformationTechnologies {
    ANALYTICAL_GEOMETRY ("Analytical geometry"),
    INTRODUCTION_TO_WEB_PROGRAMMING ("Introduction to Web Programming"),
    MATHEMATICAL_ANALYSIS_2 ("Mathematical analysis 2"),
    OOP ("Object oriented programming"),
    SPECIALIZED_ENGLISH ("Specialized English"),
    SPORTS ("Sports"),;
    private final String title;

    SubjectsFor2TermMathematicsInformaticsAndInformationTechnologies(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor3TermMathematicsInformaticsAndInformationTechnologies {
    ALGEBRA ("Algebra"),
    DIFFERENTIAL_EQUATIONS ("Differential equations"),
    ALGORITHMS_AND_DATA_STRUCTURES ("Algorithms and data structures"),
    PROBABILITY_THEORY_AND_MATHEMATICAL_STATISTICS ("Probability theory and mathematical statistics"),
    WEB_DESIGN ("Web design"),
    ELECTIVE_DISCIPLINE ("Elective discipline"),
    SPORTS ("Sports");
    private final String title;

    SubjectsFor3TermMathematicsInformaticsAndInformationTechnologies(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor4TermMathematicsInformaticsAndInformationTechnologies {
    GEOMETRY ("Geometry"),
    COMPUTER_SYSTEMS_AND_COMMUNICATIONS ("Computer systems and communications"),
    PSYCHOLOGY ("Psychology"),
    DISCRETE_MATH ("Discrete math"),
    OPERATING_SYSTEMS ("Operating Systems"),
    ELECTIVE_DISCIPLINE ("Elective discipline"),
    SPORTS ("Sports");
    private final String title;

    SubjectsFor4TermMathematicsInformaticsAndInformationTechnologies(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor5TermMathematicsInformaticsAndInformationTechnologies {
    INFORMATION_TECHNOLOGIES_IN_EDUCATION ("Information technologies in education"),
    NUMERICAL_METHODS ("Numerical methods"),
    COMPUTER_GRAPHICS_AND_PRESENTATIONS ("Computer graphics and presentations"),
    PEDAGOGY ("Pedagogy"),
    ALGEBRA_SCHOOL_COURSE ("Algebra school course"),
    SCHOOL_COURSE_IN_ANALYSIS ("School course in analysis"),
    METHODOLOGY_OF_TRAINING_IN_INFORMATICS_AND_INFORMATION_TECHNOLOGIES ("Methodology of training in informatics and information technologies"),
    COMPULSORY_ELECTIVE_DISCIPLINE_NUMBER_1_FROM_GROUP_B ("Compulsory elective discipline #1 from group B");
    private final String title;

    SubjectsFor5TermMathematicsInformaticsAndInformationTechnologies(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor6TermMathematicsInformaticsAndInformationTechnologies {
    METHODS_FOR_SOLVING_MATHEMATICAL_PROBLEMS ("Methods for solving mathematical problems"),
    SCHOOL_GEOMETRY_COURSE ("School geometry course"),
    METHODOLOGY_OF_TEACHING_MATHEMATICS ("Methodology of teaching mathematics"),
    COMPLEX_ANALYSIS ("Complex analysis"),
    DATABASES ("Databases"),
    COMPULSORY_ELECTIVE_DISCIPLINE_NUMBER_2_FROM_GROUP_B ("Compulsory elective discipline #2 from group B"),
    COMPULSORY_ELECTIVE_DISCIPLINE_NUMBER_1_FROM_GROUP_A ("Compulsory elective discipline #1 from group A");
    private final String title;

    SubjectsFor6TermMathematicsInformaticsAndInformationTechnologies(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor7TermMathematicsInformaticsAndInformationTechnologies {
    MAIN_SPECIALIZED_DISCIPLINE ("Main specialized discipline \"Competence approach and innovations in education\""),
    SCHOOL_COURSE_IN_INFORMATICS ("School course in informatics"),
    SCHOOL_COURSE_IN_INFORMATION_TECHNOLOGY ("School course in information technology"),
    EVENT_PROGRAMMING ("Event programming"),
    INTEGRATED_PRACTICUM_IN_MATHEMATICS ("Integrated practicum in mathematics"),
    INTEGRATED_PRACTICUM_IN_INFORMATICS_AND_INFORMATION_TECHNOLOGY ("Integrated practicum in informatics and information technology"),
    DISCIPLINE_IN_MATHEMATICS ("Discipline in mathematics"),
    DISCIPLINE_IN_INFORMATICS_AND_INFORMATION_TECHNOLOGIES ("Discipline in informatics and information technologies"),
    INCLUSIVE_EDUCATION ("Inclusive education"),
    CURRENT_PEDAGOGICAL_PRACTICE_IN_MATHEMATICS ("Current pedagogical practice in mathematics"),
    CURRENT_PEDAGOGICAL_PRACTICE_IN_INFORMATICS_AND_INFORMATION_TECHNOLOGIES ("Current pedagogical practice in informatics and information technologies");
    private final String title;

    SubjectsFor7TermMathematicsInformaticsAndInformationTechnologies(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


enum SubjectsFor8TermMathematicsInformaticsAndInformationTechnologies {
    INFORMATION_AND_COMMUNICATION_TECHNOLOGIES ("Information and communication technologies in learning and working in a digital environment"),
    OPTIONAL_DISCIPLINE ("Optional discipline"),
    COMPULSORY_ELECTIVE_DISCIPLINE_2_FROM_GROUP_A ("Compulsory elective discipline #2 from group A"),
    INTERNSHIP_IN_MATHEMATICS ("Internship in mathematics"),
    INTERNSHIP_PRACTICE_IN_INFORMATICS_AND_INFORMATION_TECHNOLOGIES ("Internship practice in informatics and information technologies");
    private final String title;

    SubjectsFor8TermMathematicsInformaticsAndInformationTechnologies(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
