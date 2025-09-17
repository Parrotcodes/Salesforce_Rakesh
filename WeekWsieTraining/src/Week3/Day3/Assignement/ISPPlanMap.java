package Week3.Day3.Assignement;

import java.util.*;

//HashMap → fast, no order.
//LinkedHashMap → keeps insertion order.
//TreeMap → keeps keys sorted.
public class ISPPlanMap {
    public static void main(String[] args) {

        Map<Integer, String> internetPlans = new HashMap<>();
        internetPlans.put(600, "Basic Plan");
        internetPlans.put(800, "Standard Plan");
        internetPlans.put(1000, "Premium Plan");

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        int budget = sc.nextInt();

        // lower and higher plan prices
        int lower = -1;  // "not found"
        int higher = -1;

        Set<Integer> prices = internetPlans.keySet();//array of keys

        for (int price : prices) {
            if (price < budget) { // lower than budget
                if (lower == -1 || price > lower) {
                    lower = price;
                }
            }
            if (price > budget) { // higher than budget
                if (higher == -1 || price < higher) {
                    higher = price;
                }
            }
        }

        // output
        System.out.println("\nClosest plans to your budget:");
        if (lower != -1) {
            //accessing name with key
            System.out.println("Lower plan: " + internetPlans.get(lower) + " (" + lower + ")");
        }
        if (higher != -1) {
            //here also accessing plan name using price:key
            System.out.println("Higher plan: " + internetPlans.get(higher) + " (" + higher + ")");
        }

        sc.close();
    }
}
