package org.example;


import org.example.Calc.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testApp()
    {
        Calc c = new Calc();
        int result = c.divide(20,20);
        int expected = 1;
        assertEquals(expected, result);
    }
}
