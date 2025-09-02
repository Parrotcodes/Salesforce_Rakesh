package JavaBegginerLevel.AdvConcepts.Collection.Sortings;

import java.util.*;

class StudentList{
    int age;
    String name;

    public StudentList(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "StudentList{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Sortings {
    public static void main(String[] args) {
        //        Sorting based on myOwn logic is Possible by (comparator)
        Comparator<StudentList> listnums = new Comparator<StudentList>() {

            public int compare(StudentList i, StudentList j) {
                if (i.age >j.age){
                    j = i;
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        List<StudentList> nums = new ArrayList<>();

        nums.add(new StudentList(10,"rakesh"));
        nums.add(new StudentList(02,"kesh"));
        nums.add(new StudentList(13,"esh"));
        nums.add(new StudentList(9,"rake"));


//        System.out.println("Original ArrayList: " +nums); // prints normal list as usallay

//        sorting list
//        Collections.sort(nums);

//        System.out.println("Sorted Array: "+nums);

//        sorted by own logic
//        Collections.sort(nums,listnums);
//        System.out.println(nums);
        Collections.sort(nums,listnums);
        for (StudentList s:nums){
            System.out.println(s);
        }


    }
}
