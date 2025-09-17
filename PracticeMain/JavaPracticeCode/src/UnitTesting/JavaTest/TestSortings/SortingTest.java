package UnitTesting.JavaTest.TestSortings;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTest {

    @Test
    public void testCollectionsSort() {
        List<String> names = new ArrayList<>(Arrays.asList("Zara", "Alex", "John"));
        Collections.sort(names);

        assertEquals(Arrays.asList("Alex", "John", "Zara"), names);
    }

    @Test
    public void testCustomComparator() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9));
        numbers.sort((a, b) -> b - a); // descending order

        assertEquals(Arrays.asList(9, 5, 2), numbers);
    }


//    Streams & Lambda
    @Test
    void testStreamAPISort(){
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

      List<Integer> reult =  nums.stream()
                  .filter(n-> n%2 == 0)
                  .map(n->n*n)
                  .toList();

        assertEquals(Arrays.asList(4, 16), reult);

    }
}
