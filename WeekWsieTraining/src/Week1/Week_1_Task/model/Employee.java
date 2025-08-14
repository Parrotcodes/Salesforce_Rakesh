package Week1.Week_1_Task.model;
//package Week1.Week_1_Task.model.EmployeeCategory;

//enum EmployeeCategory {
//    FULL_TIME,
//    PART_TIME,
//    INTERN
//}

public class Employee {
    private String name;
    private int id;
    private EmployeeCategory category;

    public Employee() {
    }

    public Employee(String name, int id, EmployeeCategory category) {
        this.name = name;
        this.id = id;
        this.category = category;
    }

    public Employee(String name, int id) {
    }

    public String toString() {
        return "\nEmployee_id: " + id + "\nEmp_Name: " + name + "\nEmp_Category: " + category+".";
    }
}




