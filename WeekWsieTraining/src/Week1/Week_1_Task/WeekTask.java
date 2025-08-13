package Week1.Week_1_Task;

import Week1.Week_1_Task.model.Employee;
import Week1.Week_1_Task.model.Plans;
import Week1.Week_1_Task.model.Users;

import java.util.ArrayList;
import java.util.List;


public class WeekTask {
    public static void main(String[] args) {


        List<Employee> emplist = new ArrayList<>(

                List.of(
                        new Employee("Ahbhijeet", 1112, 23),
                        new Employee("Rahul", 1112, 23),
                        new Employee("Pradeep", 1112, 23),
                        new Employee("Rohan", 1112, 23)
                )
        );

//        EmployeeList
        for (int i = 0; i < emplist.size(); i++) {
            System.out.println(emplist.get(i));
        }

        System.out.println();
//UserList
        List<Users> userlist = new ArrayList<>(
                List.of(
                        new Users("User1",34,"normal"),
                        new Users("User1",34,"normal"),
                        new Users("User1",34,"normal")
                )
        );

        for (Users u:userlist){
            System.out.println(u);
        }

        System.out.println();

//Plan model
        List<Plans> plan = new ArrayList<>(
                List.of(
                        new Plans("normal"),
                        new Plans("premium"),
                        new Plans("guest")
                )
        );

        for(Plans p : plan){
            System.out.println(p);
        }
    }
}




