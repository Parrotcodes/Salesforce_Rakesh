package Week1.Day4.Assignments;

class NewStudent {
    String name;
    int age;

    NewStudent() {
        // calling the second constructor using this()
        this("Unknown", 18);
        System.out.println("First constructor .");
    }

    NewStudent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Second constructor.");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        NewStudent s1 = new NewStudent();

        NewStudent s2 = new NewStudent("Alice", 22);
    }
}
