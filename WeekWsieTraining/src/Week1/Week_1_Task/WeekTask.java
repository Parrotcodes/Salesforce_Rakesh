package Week1.Week_1_Task;

//----------importing required classes of same package --> model-------
import Week1.Week_1_Task.model.Employee;
import Week1.Week_1_Task.model.EmployeeCategory;
import Week1.Week_1_Task.model.Plans;
import Week1.Week_1_Task.model.Users;

//enum EmployeeCategory {
//    FULL_TIME,
//    PART_TIME,
//    INTERN
//}

//1.Created Classes for Each required Catergory --> (Class,Overload Contructors with parameters) implemented
//2.Imported Classes into main calss
//3.Created Array of Objects for each class
//4.Added values through array indexes
//5.Displayed using for-loop for each Array of referenced objects

public class WeekTask {

    public static void main(String[] args) {

//---------Creating Objects------------------
        Plans[] plans = new Plans[2];
        Users[] users = new Users[2];
        Employee[] employees = new Employee[2];

//-------inserting parameter values---------
        // add User
        users[0] = new Users("Alice", "alice@example.com", "Basic");
        users[1] = new Users("Bob", "bob@example.com", "Premium");

        // Adding Employees
        employees[0] = new Employee("John", 101, EmployeeCategory.FULL_TIME);
        employees[1] = new Employee("Eve", 102, EmployeeCategory.INTERN);

        // add Plan
        plans[0] = new Plans("Basic", 199.0, "5% discount");
        plans[1] = new Plans("Premium", 499.0, "20% discount and extra premium features");

//-------------output--------------
        // users
        System.out.println("\n---------Users--------");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        // employees
        System.out.println("\n--------Employees---------");
        //we can also use foreach/enhanced-for loop concept instead of normal for-loop
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        // plans
        System.out.println("\n-------Plans--------");
        for (int i = 0; i < plans.length; i++) {
            System.out.println(plans[i]);
        }

    }
}








