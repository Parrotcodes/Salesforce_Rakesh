package Week3.Day5.CRUD;

import java.util.Scanner;

//Inputs Required
//   private String name;
//    private String email;
//    private int age; (default) !required
//    private int phone;
//    private String married; //!required
//    private String gender; //!required

public class CustomerMain {
    static void main() {
        System.out.println("=============== Welcome to "+ CustomerBluePrint.companyName+"========================");

        Scanner in = new Scanner(System.in);

        boolean exit = true;

        while (exit){
            System.out.println("************** Menu ************");
            System.out.println("1.Add new Customer record");
            System.out.println("2.Show All Customer records");
            System.out.println("3.Update Customer record");
            System.out.println("4.Delete Customer record");
            System.out.println("5.Exit()");

            System.out.print("Choose your option: ");
            int choice = in.nextInt();

            switch (choice){
                case 1:
                    in.nextLine();
                    System.out.println("Enter Customer Name: ");
                    String custname = in.nextLine();
                    System.out.println("Enter Customer Email: ");
                    String custemail = in.nextLine();
                    System.out.println("Enter Age: ");
                    int custage = in.nextInt();
                    System.out.println("Enter Phone Number: ");
                    int custphone = in.nextInt();
                    in.nextLine();
                    System.out.println("Are you Married? (Y/N): ");
                    String custmariage = in.nextLine();
                    System.out.println("Enter Gender: ");
                    String custgender = in.nextLine();

//Calling Method passing parameters
                    Customer_CRUD.AddNewCustomer(custname,custemail,custage,custphone,custmariage,custgender);
                    System.out.println("------------------------------------------------------------------- ");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Show all students info");
                    Customer_CRUD.showAllCustomers();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("update student info by id");
                    System.out.println("Enter Customer_ID to Update Profile: ");
                    int upid = in.nextInt();
                    in.nextLine();
                    System.out.println("Update Customer Name: ");
                    String upname = in.nextLine();
                    System.out.println("Update Age: ");
                    int upage = in.nextInt();
                    in.nextLine(); //add new line space after the int (required)
                    System.out.println("Update Martial Status (Y/N): ");
                    String upmarry = in.nextLine();
                    Customer_CRUD.UpdateCustomerById(upname,upage,upmarry,upid);
                    System.out.println("------------------------------------------------------------------- ");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Delete Customer info by id");
                    int custid = in.nextInt();
                    Customer_CRUD.DeleteCustomerById(custid);
                    System.out.println("------------------------------------------------------------------- ");
                    System.out.println();
                    break;
                case 5:
                    System.out.println(STR."------Have a nice to All \{CustomerBluePrint.companyName} Customers! -------");
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
