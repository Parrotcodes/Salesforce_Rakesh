package org.example.ArrayTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayElements {

    @Test
    void testArrays(){
        int[] expected = {2,3,4,5};
        int[] actual = {4,2,5,3};

        Arrays.sort(actual); // solve the case {2,3,4,5}

//        assertEquals(expected,actual);  // it will not check the inside elements it's just checking the refernce of objects

        assertArrayEquals(expected,actual);

    }
}
