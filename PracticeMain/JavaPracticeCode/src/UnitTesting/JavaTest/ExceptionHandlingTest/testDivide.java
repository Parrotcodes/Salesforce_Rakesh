package UnitTesting.JavaTest.ExceptionHandlingTest;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class testDivide {

    @Test
    public void testingDivision(){
        Divide obj = new Divide();
        int result = obj.div(10,5);

        assertEquals(2,result);
        assertThrows(ArithmeticException.class,() -> obj.div(10, 0));
    }
}
