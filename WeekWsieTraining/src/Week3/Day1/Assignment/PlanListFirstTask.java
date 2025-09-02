package Week3.Day1.Assignment;

import java.util.*;

//1.Create a Java programme that saves the plan list in a set collection.
//2. Use the all set function on the set that we previously created
public class PlanListFirstTask {
    static void main() {
//        Question - 1
        System.out.println("-----------------SET of PLANS-----------------");

//        storing plans in array format
        String[] plans = {"Basic Plan","Premium Plan","Golden Plan"};
//        System.out.println("Array: "+plans[1]);
        for (String plan : plans){
            System.out.println("Array Item: "+plan);
        }
        System.out.println("--------------------------------------------");

//        convert array to ArrayList
        List<String> planlist = new ArrayList<>(Arrays.asList(plans));
        planlist.addFirst("Guest");
        System.out.println("List: "+planlist);

        System.out.println("--------------------------------------------");

//        List to Set conversion
//        Set<String> setofplans = new HashSet<>(planlist); //random order
        Set<String> setofplans = new LinkedHashSet<>(planlist); //inserted order
        setofplans.add("Diamond Plan");
        setofplans.add("Diamond Plan");//duplicate
        System.out.println("Set: "+setofplans);

        System.out.println("--------------------------------------------");
//        set to Array
        String[] setToArray = planlist.toArray(new String[0]);
        System.out.println("Set to Arrays: "+setToArray[0]);//index value
        System.out.println("Set -> Arrays: "+setToArray.getClass().getSimpleName());//index value
//        for (String s:setToArray){
//            System.out.println("Set -> Array: "+setToArray.getClass().getSimpleName());
//        }

//        Question-2
        System.out.println("----------------All functional Methods of Plans Set-------------------");

        System.out.println(setofplans.size()); //size()

        System.out.println(setofplans.contains("Guest"));//contains()

        System.out.println(setofplans.remove("Guest")); //remove()
        System.out.println(setofplans);

        System.out.println(setofplans.isEmpty()); //isEmpty()

        setofplans.clear(); //clear List
        System.out.println(setofplans);

        Set<String> plansList = new LinkedHashSet<>();
        plansList.add("User");
        plansList.add("Guest");
        plansList.add("subscriber");
        setofplans.addAll(plansList); //addAll to prev set
        System.out.println("After addAll Set :"+setofplans);







    }
}
