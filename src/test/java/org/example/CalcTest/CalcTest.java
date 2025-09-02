package org.example.CalcTest;

import org.example.Calc.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalcTest {
    Calc c = new Calc();

    @Test
    void testDivision(){
        assertEquals(2,c.divide(10,5),"Division test case failed!");
    }

    @Test
    void testMultiply(){
        assertEquals(10,c.multiply(5,2),"Multiplication test case failed!");
    }

    @Test
    void testSquare(){
        assertEquals(4,c.square(2),"square value tast failed!");
    }

//    using dependency we are giving msg property by using Lambda expression
    @Test
    void testSquare_Surefire_supplier(){
        assertEquals(4,c.square(2),()->"square value tast failed!");
    }

//    we can pass message using supplier interface
//    difference
//              normal way: we can give msg as parameter and it is evaluated if though test is pass or fail
//              using supplier : we can give msg as parameter and it is evaluated when test failed. efficiency & Performance  is increased
}
