package JavaIntermediateLevel.Projects.StudentManagementSystem;

public class StudentBluePrint {
    protected static final String SchoolName = "ITT School";
    private String studentName;
    private int phone;


    public StudentBluePrint(String studentName, int phone) {
        this.studentName = studentName;
        this.phone = phone;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Students_DB_Info{" +
                "studentName='" + studentName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
