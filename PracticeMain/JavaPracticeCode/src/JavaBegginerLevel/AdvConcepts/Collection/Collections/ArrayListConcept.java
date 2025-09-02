package JavaBegginerLevel.AdvConcepts.Collection.Collections;

import java.util.*;
// LIST, SET, QUEUE -- interface

//LIST - ArrayList,LikedList, Vector--(Stack)

//ArrayList -- resizable array (dynamic)
//              --good for searching/accessing elements
//                -- slower for insertion/deletion in the middle and not threadsafe(not syncronized)
public class ArrayListConcept {
    public static void main(String[] args) {
//        List names = new ArrayList<>();
//        Map nam = new HashMap();
//        nam.put("name","rakesh");
//        nam.put(12,"salary");
//        nam.put("age",45);
//
//        System.out.println(nam);

//        ArrayList nums = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40); // appending element at end of the list
//    nums.add("narme");


//        list of elements
        System.out.println(nums);

        //        nums.get(0); //get the index value of the index
        System.out.println("Inex value: "+nums.get(3));

//        nums.indexOf(30); //get the index number of the value
        System.out.println("Index positon: "+nums.indexOf(30));


//        ArrayList Methods
        System.out.println("IsEmpty: "+nums.isEmpty()); //isEmpty()

        nums.add(0,1); // adding new element at index position
        System.out.println(nums);

//        addAll
        ArrayList<Integer> l2 = new ArrayList<>(3); //initial Capacity
        l2.add(100);
        l2.add(200);
        l2.add(300);

        nums.addAll(l2);
        System.out.println(nums.addAll(0,l2)); //at index 0


//        nums.get(nums.getFirst());
        System.out.println(nums.getFirst()); //getting First element form the list
        System.out.println(nums.getLast()); //getting Last element from the list

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(11);
        nums2.add(22);
        nums2.add(33);

        nums.addAll(nums2);  // addAll to add new List at the end of the list
        System.out.println(nums);

        System.out.println(nums.size()); //arrayList size/length

//        contains
        System.out.println("Contains: "+nums.contains(800));

//        remove
//        nums.remove(0);
        System.out.println("removed:"+nums.remove(0));
        System.out.println("After removed:"+nums);

//        insert at index position
        System.out.println(nums.set(1,111));
        System.out.println("New item replaced/inserted at Index 1: "+nums);

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList = (ArrayList<Integer>) nums.clone();
        System.out.println("Cloned List: "+newList);

//       Converting ArrayList to array
        Integer[] numbers = newList.toArray(new Integer[0]);
//        Integer[] numbers = newList.reversed().toArray(new Integer[0]); //reversed arrayList and converting to array
// type checking after convertion
//      System.out.println(typeof(numbers)); error

        System.out.println(numbers.getClass());
        System.out.println(numbers.getClass().getSimpleName());
        System.out.println(Arrays.toString(numbers));

        int[] num3 = {2,3,4,5};
        System.out.println(num3.getClass());
//        System.out.println(num3.getClass().getSimpleName());
        System.out.println(num3.getClass());

//        var array = newList.stream().mapToInt(n -> n).toArray();
//        System.out.println(Arrays.toString(array));

        ArrayList nameslist = new ArrayList();
        nameslist.add("rakesh");
        nameslist.add(34);
        nameslist.add(true);

        System.out.println(nameslist);
        System.out.println(nameslist.get(0));

        //type checking
        if (nameslist instanceof Object){
            System.out.println(nameslist+"is object");
        }else {
            System.out.println("not object");
        }

        nameslist.clear();
        System.out.println("Clear: "+nameslist);
        System.out.println("isEmpty: "+nameslist.isEmpty());


//        Excersie task -- list of names to array convert
        ArrayList<String> names = new ArrayList<>();
        names.add("Hary");
        names.add("Java");
        names.add("Python");
        names.add("Jhon");

        System.out.println(names);
//        convert list to array
        String[] arrynames = names.toArray(new String[0]);
        System.out.println("Converted List to aray: "+ Arrays.toString(arrynames));

        int[] n = new int[2];
        n[0]=10;
        n[1]=20;

        System.out.println(n[0]); // no index method


    }
}
