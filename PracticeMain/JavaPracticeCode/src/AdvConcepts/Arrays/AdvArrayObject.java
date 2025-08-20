package AdvConcepts.Arrays;

class Student{
    String name;
    int rollno;
    int marks;
}

public class AdvArrayObject {
    public static void main(String[] args) {
        Student std = new Student();
        std.name="Hary";
        std.rollno=789;
        std.marks =590;

        Student std1 = new Student();
        std1.name="Jhon";
        std1.rollno=89;
        std1.marks =550;

        Student std2 = new Student();
        std2.name="Hary";
        std2.rollno=789;
        std2.marks =590;

//        Storing in Array as a refernce of obj
        Student studens[] = new Student[3];
        studens[0] = std;
        studens[1] = std1;
        studens[2] = std2;

        for (int i = 0; i < studens.length; i++) {
            System.out.println("------ Student Info: Student id: "+i+"------------");
            System.out.println("RollNo: "+studens[i].rollno +"\nName: "+studens[i].name+"\nMarks: "+studens[i].marks);
            System.out.println();
        }


    }
}
