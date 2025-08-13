package Week1.Week_1_Task.model;

public class Employee {
    private String name;
    private int empId;
    private int age;

    public Employee() {
    }

    public Employee(String name, int empId, int age) {
        this.name = name;
        this.empId = empId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", age=" + age +
                '}';
    }
}
