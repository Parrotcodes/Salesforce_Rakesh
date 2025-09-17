package UnitTesting.JavaTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


class BasicsTest {

    @Test
    void sampleTest() {
        assertEquals(4, 2 + 2);
    }

//    Variables
    @Test
    void testPrimitiveTypes() {
        int age = 25;
        double salary = 55000.50;
        char grade = 'A';
        boolean isActive = true;

        assertEquals(25, age);
        //assertEquals(String.valueOf(55000.50), salary,"Something Went wrong");
        assertEquals('A', grade);
        assertTrue(isActive);
    }

//    Wrapper Test
    @Test
    void testWrapperAutoBoxing() {
        Integer num = 10; // autoboxing
        //assertEquals(10, num);

        int unboxed = num; // unboxing
        assertEquals(10, unboxed);
    }


    @Test
    void testWrapperMethods() {
        String str = "100";
        int value = Integer.parseInt(str);
        assertEquals(100, value);

        String binary = Integer.toBinaryString(5);
        assertEquals("101", binary);
    }

    @Test
    void testArrayInitialization() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(5, numbers.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, numbers);
        }

    @Test
    void testArraySorting() {
        int[] data = {5, 2, 9, 1};
        Arrays.sort(data);
        assertArrayEquals(new int[]{1, 2, 5, 9}, data);
    }


    @Test
    void testInstanceOf() {
        String text = "Hello";
        Object obj = text;

        assertTrue(obj instanceof String);
        assertFalse(obj instanceof Integer);
    }

//    Control Statements
    @Test
    void testIfElse() {
        int num = 10;
        String result = (num % 2 != 0) ? "Even" : "Odd";
        assertEquals("Odd", result);
    }

//    Switch Case
    @Test
    void testSwitchCase() {
        int day = 3;
        String dayName = switch (day) {
                                case 1 -> "Monday";
                                case 2 -> "Tuesday";
                                case 3 -> "Wednesday";
                                default -> "Unknown";
                            };
        assertEquals("Wednesday", dayName);
    }


//    Loops
    @Test
    void testForSumLoop(){
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        assertEquals(15,sum);
    }

    @Test
    void testWhileLoopSum(){
        int i = 1, n= 5;
        int sum = 0;
        while (i<=n){
            sum+= i;
            i++;}
    }

//    Strings
    @Test
    void testStringMethods(){
        String name = "Java is a Program";

        //assertEquals("Java is a Program",name,"Not equal check the String msg");
        assertEquals(17,name.length());
        assertEquals("JAVA IS A PROGRAM",name.toUpperCase());
        assertTrue(name.contains("Java"));
    }

    @Test
    void testStringEquality() {
        String s1 = new String("Hello");
        String s2 = "Hello";

        assertTrue(s1.equals(s2)); // value equality
        assertFalse(s1 == s2);     // reference inequality
    }
}
