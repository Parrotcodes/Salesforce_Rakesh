package Week2.Day5.Assignment;

import java.util.regex.Pattern;

class MyClass {

    private static Pattern PATT = Pattern.compile("(");

}

public class FindTypeOfException {
    public static void main(String[] args) {

        try {

            new MyClass();

        } catch (Throwable t) {}


        new MyClass();

    }
}
