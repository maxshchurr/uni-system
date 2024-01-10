package students.system.model.student;

public enum Specialization {
    SOFTWARE_TECHNOLOGIES_AND_DESIGN("Software technologies and design"),
    BUSINESS_IT("Business IT"),
    INFORMATICS("Informatics"),
    SOFTWARE_ENGINEERING("Software engineering"),
    MATHEMATICS("Mathematics"),
    MATHEMATICS_INFORMATICS_AND_INFORMATION_TECHNOLOGIES("Mathematics, informatics and information technologies "),
    APPLIED_MATHEMATICS("Applied mathematics"),
    BUSINESS_MATHEMATICS("Business mathematics"),
    INFORMATION_TECHNOLOGY_MATHEMATICS_AND_EDUCATIONAL_MANAGEMENT("Information Technology, Mathematics and Educational Management");

    private final String title;

    Specialization(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
