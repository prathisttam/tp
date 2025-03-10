package seedu.internsprint.internship;

public class GeneralInternship extends Internship {
    private String department;

    public GeneralInternship(String companyName, String role, String department) {
        super(companyName, role);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Company: " + companyName + ", Role: " + role + ", Dept: " + department;
    }

    @Override
    public String getType() {
        return "general";
    }
}
