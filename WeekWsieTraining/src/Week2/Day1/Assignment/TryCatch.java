package Week2.Day1.Assignment;

//Exception Handling
//If any Error with the Logic or code it will stop execution of code.It will not run next lines of code too.
// To handle the error and run the next lines we need Exception Handling Concept
// we can resolve such type of errors with -- try,catch,throw,throws,finally

// we need to Handle RunTime Exception
public class TryCatch {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
        catch (Exception e) { // general exception
            System.out.println("Caught general Exception");
        }

// Solution:
//Always catch subclasses first, then superclasses (Exception) -- we can see Exception Hierarchy concept
        //if we use Exception above the NullPointer Exception it will not check the NullPointerException
        // by default all Exceptions are handled by Exception.
        // so, they can not handle the NullPointerException in such cases

        // To make sure this check the NullPointerException, keep Exception handle always as last exception only.
        // if the above Catch exceptions are not handled by the above catches then the final catch(Exception e) will take care.

    }
}
