package org.example.ArrayTest;

import org.example.Array.ArraySorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class TestArraysExceptionHandling {
//    Note: Test cases should fail when there are no exception and pass if there is an exception
    @Test
    void testingArray_Exception(){
        try {
        ArraySorting arr = new ArraySorting();
        int unsortedArray[] =null; //exception come from main developing file
//        int unsortedArray[] ={2,5,1,4,6,3};
//        int expectedArray[] ={1,2,3,4,5,6};
//        int expectedArray[] ={0,1,2,3,4,5,6}; // length not matching case should fail

        int mysortedArray[] = arr.sortingArray(unsortedArray);
//    System.out.print(mysortedArray);

        for (int e : mysortedArray){
            System.out.println(e);
        }
        System.out.println("next line printing..");

//        assertArrayEquals(expectedArray,mysortedArray,()->"Arrays sorting test case failed!");

        fail(); //wantedly failing case it means everythin is working properly or else it means exception is generated

        }catch (NullPointerException e){
            System.out.println("Exception generated...."+e);
        }


    }
}



