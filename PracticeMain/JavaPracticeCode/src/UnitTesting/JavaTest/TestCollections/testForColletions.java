package UnitTesting.JavaTest.TestCollections;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testForColletions {

//    List -- allow duplicates
    @Test
    void testArrayasList(){
        List<String> names = new ArrayList<>();
        names.add("Rakesh");
        names.add("Honey");
        names.add("Jhon");
        names.add("Jhon");

        assertEquals(4,names.size());
        assertTrue(names.contains("Jhon"));
        assertEquals("Rakesh",names.get(0));
    }

    @Test
    void testListIteration() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(5,nums.size());

        int sum = 0;
        for(Integer i : nums){
            sum += i;
        }

        assertEquals(15,sum);
    }


//    Set -- does not allow duplicates
    @Test
    void testForSet(){
        Set<String> names = new HashSet<>();
        names.add("User");
        names.add("demo");
        names.add("User"); //not allow

//        assertEquals(3,names.size()); // actual: 2 duplicate not allowed
        assertEquals(2,names.size());
        assertTrue(names.contains("User"));
    }

    @Test
    void testSortSet(){
        Set<Integer> nums = new TreeSet<>();
        nums.add(20);
        nums.add(10);
        nums.add(40);
        nums.add(10);//duplicate not allowed

//        assertEquals(4,nums.size());
        assertEquals(3,nums.size());

//        assertEquals(Arrays.asList(20,10,40),new ArrayList<>(nums)); //tree set store nums in sorting order
        assertEquals(Arrays.asList(10,20,40),new ArrayList<>(nums)); //sorted order
    }



//    MAP
    @Test
    void testForMap(){
        Map<Integer,String> info = new LinkedHashMap<>();
        Map<Integer,String> info2 = new HashMap<>();

        info.put(1,"User 1");
        info.put(2,"User 2");
        info.put(3,"User 3");

        info2.put(1,"User 1");
        info2.put(2,"User 2");
        info2.put(3,"User 3");

//        System.out.println(info.values());
//        System.out.println(info.keySet());
        assertEquals(3, info.size());
        assertEquals("User 2",info.get(2));
        assertTrue(info.containsKey(3));

        Integer[] guess = {1, 2, 3};
        assertEquals(Arrays.asList(guess),new ArrayList<>(info.keySet()));

        Set<Integer> expected = Set.of(1, 2, 3);
        assertEquals(expected, info.keySet());

        Set<Integer> expectedKeys = Set.of(1, 2, 3);
        Set<String> expectedValues = Set.of("User 1", "User 2", "User 3");


    }

    @Test
    void testIterateMap(){
        Map<String,Integer> listOfNums =new TreeMap<>();
        listOfNums.put("A",10);
        listOfNums.put("B",20);
        listOfNums.put("C",30);

        int total = 0;
       for(int i : listOfNums.values()){
            total += i;
        }

        assertEquals(60,total);
//       assertEquals(40,total);



    }

}
