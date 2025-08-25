package Week2.Day5.Assignment;

import java.util.regex.Pattern;

//PatternSyntaxException
//First new MyClass() call -> ExceptionInInitializerError caused by PatternSyntaxException.
//Second new MyClass() call -> NoClassDefFoundError.
// the class failed initialization earlier. Once it fails, it won’t attempt re-initialization again.
//   JVM marks it as unusable. So,Java Throws: NoClassDefFoundError

//Error: ExceptionInInitializerError: Exception java.util.regex.PatternSyntaxException [in thread "main"]

class MyClass {
    //PatternSyntaxException
    private static Pattern PATT = Pattern.compile("(");
}

public class FindTypeOfException {
    public static void main(String[] args) {
        try {

            new MyClass();

        } catch (Throwable t) {}

//ClassNotFoundError
        new MyClass();

    }
}
