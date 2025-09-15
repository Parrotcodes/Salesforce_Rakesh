package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    	   List<ISPPlans> plans = new ArrayList<>();

           plans.add(new ISPPlans("Basic Plan", 99, "2G",10, 28));
           plans.add(new ISPPlans("Silver Plan", 299, "4G",130, 56));
           plans.add(new ISPPlans("Diamond Plan", 999, "5G",150, 365));
           plans.add(new ISPPlans("Gold Plan", 499, "2G",100, 14));

//           System.out.println(plans);
           Scanner in = new Scanner(System.in);
           System.out.println("\nSort by: 1.Price (default Comparable)  2.Speed  3.Validity  4.Type 5.Plan_Name");

           int choice = in.nextInt();

           switch (choice){
//               Lambda Expression
               case 1 ->  Collections.sort(plans);
               case 2 ->Collections.sort(plans,new sppedsort());
               case 3 -> Collections.sort(plans,new validsort());
               case 4 -> Collections.sort(plans,new typecheck());
               case 5 -> Collections.sort(plans,new namesort());
               default-> System.out.println("Invalid choice");
           }

           System.out.println("Sorted plans: ");

           //Simplified using Collection forEach method we can reduce our logic and implementation
           plans.forEach(  n -> System.out.println(n)); // integer -> n (Explanation - below comments)

    }
}