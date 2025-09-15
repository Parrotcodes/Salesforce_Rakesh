package com.task.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.example.ISPPlans;
import org.example.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

class PlansMainTest {

    private List<ISPPlans> plans;
    
    
//    @Test
//    void testSortByPrice() {
//    	 plans = new ArrayList<>();
//         plans.add(new ISPPlans("Basic Plan", 99, "2G", 10, 28));
//         plans.add(new ISPPlans("Silver Plan", 299, "4G", 130, 56));
//         plans.add(new ISPPlans("Diamond Plan", 999, "5G", 150, 365));
//         plans.add(new ISPPlans("Gold Plan", 499, "2G", 100, 14));
//         
//        Collections.sort(plans); // using Comparable (price)
//        assertEquals("Basic Plan", plans.get(0).getName());
//        assertEquals("Silver Plan", plans.get(1).getName());
//        assertEquals("Gold Plan", plans.get(2).getName());
//        assertEquals("Diamond Plan", plans.get(3).getName());
//    }


    @BeforeAll
   static void begin() {
    	System.out.println("Testing Started from here.......");
    }
    
    @AfterEach
    void testend() {
    	System.out.println("# Test case passed!");
    }
    
    @AfterAll
   static void end() {
    	System.out.println("Testing completed successfully........!");
    }
    
   static int count = 0; //static refers to same datatype entire testcases (common to all)
   
    @BeforeEach
    void setUp() {
//    	for(int i=1;i<4;i++) {
//    	System.out.println("#Case:"+i);
//    	}
    	
    	count++;
    	System.out.println("#Case:"+count);
    	
        plans = new ArrayList<>();
        plans.add(new ISPPlans("Basic Plan", 99, "2G", 10, 28));
        plans.add(new ISPPlans("Silver Plan", 299, "4G", 130, 56));
        plans.add(new ISPPlans("Diamond Plan", 999, "5G", 150, 365));
        plans.add(new ISPPlans("Gold Plan", 499, "2G", 100, 14));
    }

    @Test
    void testSortByPrice() {
        Collections.sort(plans); // using Comparable (price)
        assertEquals("Basic Plan", plans.get(0).getName());
        assertEquals("Silver Plan", plans.get(1).getName());
        assertEquals("Gold Plan", plans.get(2).getName());
        assertEquals("Diamond Plan", plans.get(3).getName());
    }
    
    // another class methods
    @Test
    void speedsort() {
        Collections.sort(plans, new sppedsort());
        assertEquals(10, plans.get(0).getSpeed());   // lowest speed
        assertEquals(100, plans.get(1).getSpeed()); 
        assertEquals(130, plans.get(2).getSpeed()); 
        assertEquals(150, plans.get(3).getSpeed()); 
    }

    @Test
    void validsort() {
        Collections.sort(plans, new validsort());
        assertEquals(14, plans.get(0).getValidity());
        assertEquals(28, plans.get(1).getValidity());
        assertEquals(56, plans.get(2).getValidity());
        assertEquals(365, plans.get(3).getValidity());
    }

    @Test
    void typecheck() {
        Collections.sort(plans, new typecheck());
        assertEquals("2G", plans.get(0).getType());
        assertEquals("2G", plans.get(1).getType());
        assertEquals("4G", plans.get(2).getType());
        assertEquals("5G", plans.get(3).getType());
    }

    @Test
    void namesort() {
        Collections.sort(plans, new namesort());
        assertEquals("Basic Plan", plans.get(0).getName());
        assertEquals("Diamond Plan", plans.get(1).getName());
        assertEquals("Gold Plan", plans.get(2).getName());
        assertEquals("Silver Plan", plans.get(3).getName());
    }
}
