package UnitTesting.JavaTest.TestGenric;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class GenricTesting<T> {
    private T value;
    void setValue(T value) { this.value = value; }
    T getValue() { return value; }
}

class GenericsTest {

    @Test
    void testGenericString() {
        GenricTesting<String> msg = new GenricTesting<>();
        msg.setValue("Hello"); //string

        assertEquals("Hello", msg.getValue()); //expected: string
    }

    @Test
    void testGenericInterger(){
        GenricTesting<Integer> number = new GenricTesting<>();
        number.setValue(100);

        assertEquals(Integer.valueOf(100),number.getValue());
    }

}

