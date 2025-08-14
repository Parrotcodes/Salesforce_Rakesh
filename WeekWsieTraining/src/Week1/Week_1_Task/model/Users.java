package Week1.Week_1_Task.model;

public class Users {
    private String name;
    private String email;
    private String planType;

    public Users(String name, String email, String planType) {
        this.name = name;
        this.email = email;
        this.planType = planType;
    }

    public String toString() {
        return "\nUser_Name: " + name + "\nEmail: " + email + "\nPlanType: " + planType + ".";
    }
}
