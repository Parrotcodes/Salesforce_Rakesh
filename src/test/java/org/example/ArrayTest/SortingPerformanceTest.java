package org.example.ArrayTest;

import org.example.Array.ArrySortingPerformance;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class SortingPerformanceTest {
    @Test
    void assetTimeout_Performance_ofSortingArray(){
        ArrySortingPerformance arr = new ArrySortingPerformance();
//        int unsortedArray[] =null; //exception come from main developing file
        int unsortedArray[] ={2,5,1,4,6,3};

//        lambda expression using supplier
            assertTimeout(Duration.ofMillis(11),()->arr.sortPerform(unsortedArray)); // success test passed
//            assertTimeout(Duration.ofMillis(10),()->arr.sortPerform(unsortedArray)); // test case failed!
    }
}
