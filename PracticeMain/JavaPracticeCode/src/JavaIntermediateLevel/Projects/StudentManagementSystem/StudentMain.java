package JavaIntermediateLevel.Projects.StudentManagementSystem;

import java.util.Scanner;

public class StudentMain {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println(STR."----------WELCOME TO \{StudentBluePrint.SchoolName}-------------"); //static variable type

        System.out.println("************** Menu ************");
        boolean exit = true;

        while (exit){

            System.out.println("1.Add new Student record");
            System.out.println("2.Show All Students records");
            System.out.println("3.Update Student record");
            System.out.println("4.Delete Student record");
            System.out.println("5.Exit()");

            System.out.print("Choose your option: ");
            int choice = in.nextInt();

        switch (choice){
            case 1:
                in.nextLine();
                System.out.println("Enter Student Name: ");
                String stdname = in.nextLine();
                System.out.println("Enter Phone Number: ");
                int stdphone = in.nextInt();

                StudentBluePrint newstudent = new StudentBluePrint(stdname,stdphone);
                boolean newstd = StudentDB_CRUD.insetStudentDB(newstudent);
                System.out.println("added new student: -> "+newstudent);
                System.out.println("------------------------------------------------------------------- ");
                System.out.println();
                break;
            case 2:
                System.out.println("Show all students info");
                StudentDB_CRUD.showAllStudents();
                System.out.println("------------------------------------------------------------------- ");
                System.out.println();
                break;
            case 3:
                System.out.println("update student info by id");
                System.out.println("Enter student id: ");
                int uid = in.nextInt();
                in.nextLine(); //add new line space after the int (required)
                System.out.println("Enter Student new Name: ");
                String uname = in.nextLine();
                StudentDB_CRUD.UpdateStudentInfo(uid,uname);
                System.out.println("------------------------------------------------------------------- ");
                System.out.println();
                break;
            case 4:
                System.out.println("Delete student info by id");
                int stdid = in.nextInt();
//                in.nextLine();
//                String name = in.nextLine();
                boolean res = StudentDB_CRUD.deleteStudentById(stdid);
                if (res){
                    System.out.println("Deleted student : "+stdid);
                }else {
                    System.out.println("Invalid id");
                }
                System.out.println("------------------------------------------------------------------- ");
                System.out.println();
                break;
            case 5:
                System.out.println(STR."------Have a nice Day \{StudentBluePrint.SchoolName} -------");
                System.out.println();
                exit = false;
                break;
            default:
                System.out.println("Invalid choice! Please select options (1-5)");
                System.out.println("------------------------------------------------------------------- ");
                System.out.println();
            }
        }
    }
}
