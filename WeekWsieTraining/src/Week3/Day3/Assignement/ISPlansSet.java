package Week3.Day3.Assignement;

import java.util.Scanner;
import java.util.TreeSet;

public class ISPlansSet {
    static void main() {
        Scanner input = new Scanner(System.in);

//        Passing class as Type of Genric to the TreeSet of plans
        TreeSet<InternetPlans> plans = new TreeSet<>();

        plans.add(new InternetPlans(99,"Basic Plan"));
        plans.add(new InternetPlans(299,"Silver Plan"));
        plans.add(new InternetPlans(599,"Gold Premium"));
        plans.add(new InternetPlans(999,"Diamond Premium"));

        System.out.print("Enter your budget: ");
        int budget = input.nextInt();

        InternetPlans userplan = new InternetPlans(budget,"Budget");

        InternetPlans lower = plans.lower(userplan); // lower() form TreeSet
        InternetPlans higher = plans.higher(userplan); // higher() form TreeSet

        System.out.println("Customer Budget: "+budget);

        if (lower != null) {
//            System.out.println("Closest lower plan: " + lower.getPlanName() +" -> "+ lower.getPrice()); //using getters
            System.out.println("Closest lower plan: " + lower); //toString()
        } else {
            System.out.println("No lower plan available");
        }

        if (higher != null) {
//            System.out.println("Closest higher plan: " + higher.getPlanName()+" -> " + higher.getPrice()); //using getter
            System.out.println("Closest higher plan: " + higher); //toString()
        } else {
            System.out.println("No higher plan available");
        }
    }
}
