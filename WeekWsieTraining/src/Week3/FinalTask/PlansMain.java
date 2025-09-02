package Week3.FinalTask;

import java.util.*;
import java.util.function.Consumer;

public class PlansMain {
    static void main() {
        List<ISPPlans> plans = new ArrayList<>();

        plans.add(new ISPPlans("Basic Plan", 99, "2G",10, 28));
        plans.add(new ISPPlans("Silver Plan", 299, "4G",130, 56));
        plans.add(new ISPPlans("Diamond Plan", 999, "5G",150, 365));
        plans.add(new ISPPlans("Gold Plan", 499, "2G",100, 14));

//        System.out.println(plans);
        Scanner in = new Scanner(System.in);
        System.out.println("\nSort by: 1.Price (default Comparable)  2.Speed  3.Validity  4.Type 5.Plan_Name");

        int choice = in.nextInt();

        switch (choice){
//            Lambda Expression
            case 1 ->  Collections.sort(plans);
            case 2 ->Collections.sort(plans,new SpeedComparator());
            case 3 -> Collections.sort(plans,new ValidityComparator());
            case 4 -> Collections.sort(plans,new Typecomparator());
            case 5 -> Collections.sort(plans,new PlanNameComparator());
            default-> System.out.println("Invalid choice");
        }

        System.out.println("Sorted plans: ");

        //Simplified using Collection forEach method we can reduce our logic and implementation
        plans.forEach(  n -> System.out.println(n)); // integer -> n (Explanation - below comments)


//        for (int i = 0; i < plans.size(); i++) { //looping arrayList
//            System.out.println(plans.get(i));
//        }

//        for (ISPPlans p :plans){  //enhanced for-loop
//            System.out.println(p);
//        }

//        Consumer<Integer> cons = new Consumer<Integer>() {
//        Consumer<ISPPlans> cons = new Consumer<ISPPlans>() { //Annyonmous class
//            @Override
//            public void accept(ISPPlans integer) {
//                System.out.println(integer);
//            }
//        };

//        plans.forEach(cons); //we need object of Consumer class

//        plans.forEach(  new Consumer<ISPPlans>() {   // Lambda Expression we can use
//            @Override
//            public void accept(ISPPlans integer) {
//                System.out.println(integer);
//            }
//        });

//        plans.forEach(  integer -> System.out.println(integer)); // integer -> n

//        //using Collection forEach method we can reduce our logic and implementation
//        plans.forEach(  n -> System.out.println(n)); // integer -> n


//        INTERNAL WORKING OF forEach LOOP
//        Iterator<ISPPlans> iterator = plans.iterator();
//           while(iterator.hasNext()) {
//               System.out.println(iterator.next());
//           };


    }



}
