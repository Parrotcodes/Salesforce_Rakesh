package JavaBegginerLevel.AdvConcepts.Collection.Collections;

import java.util.LinkedList;

//linkedList is used to insert/remove at any place easy and fast compare to Array
//in ArrayList if we want to set/add new element at index postion then remaing all elements need to shift their positon one by one takes so much time -- O(n)
//using LinkedList we can insert/delete at position fast -- O(1) and more methods available
public class ArrayLinkedListConcept {
    static void main() {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.addLast(50);
        l1.addLast(60);
        l1.addFirst(0);
        l1.add(1,5);
        l1.remove(2);
        l1.removeLast();
        l1.removeFirst();


//        Stack<Integer> l2 = new Stack<>();


        System.out.println(l1);
    }
}
