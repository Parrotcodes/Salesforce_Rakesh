package org.example.Array;

import java.util.Arrays;

public class ArrySortingPerformance {
    public int[] sortPerform(int[] arr){
        for (int i = 0; i < 1000000; i++) {
            Arrays.sort(arr);
        }
        return arr;
    }
}
