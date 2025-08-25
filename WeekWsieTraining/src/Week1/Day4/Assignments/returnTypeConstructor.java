package Week1.Day4.Assignments;

class Student {
    String name;

    Student(String n) {
        name = n;
        System.out.println("Constructor called: " + name);
    }

    // Looks like a constructor, but has return type → normal method
    void Student(String n) {
        name = n;
        System.out.println("This is a method, not a constructor!");
    }
}

public class returnTypeConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");

        // This will not call the "void Student()" method automatically
        // If you want it, you must call it explicitly:
        s1.Student("Bob");
    }
}

