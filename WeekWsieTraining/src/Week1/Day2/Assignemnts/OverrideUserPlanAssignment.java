package Week1.Day2.Assignemnts;

import java.util.Scanner;

class UserPlan{
    public void getOffers(){
        System.out.println("Normal User: 5% discount on all products");
    }
}

class PrimeUsers extends UserPlan{
    public void getOffers(){
        System.out.println("Prime User: 20% discount, Free delivary and Fast delivary");
    }
}

public class OverrideUserPlanAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userType = sc.nextLine().toLowerCase();

        UserPlan plan;

        if(userType.equals("prime")){
            plan = new PrimeUsers();
        }else {
            plan = new UserPlan();
        }

        plan.getOffers();
    }
}
