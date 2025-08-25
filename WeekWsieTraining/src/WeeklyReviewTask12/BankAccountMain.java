package WeeklyReviewTask12;

import WeeklyReviewTask12.NewAccount.CheckBankOwnException;
import WeeklyReviewTask12.NewAccount.NewBankAccount;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args){
        System.out.println("************ BANKING SYSTEM ***************");


        Scanner input = new Scanner(System.in);
        boolean exit = true;
        boolean accountCreated = false;

        do{
            try {
//        OPTIONS -> BALANCE,DEPOSIT, WITHDRAW
            System.out.println("\n 0.New Account \n 1.Check Balance \n 2.Deposit \n 3.Withdraw \n 4.Exit ");
//        userInput
            System.out.println("Choose Your Option: ");
            int option = input.nextInt();
//        Cases
            switch (option) {
                case 0:

                    //New Account creating
                    Scanner sc = new Scanner(System.in);
                    try {
                        System.out.println("Do you want to create saving or current : 1. Saving 2. Current");
                        int choice = input.nextInt();

                        System.out.println("Enter the A/C Holder name : ");
                        String Hname = sc.nextLine();

//                        System.out.println("Create a new AccountNumber : ");
                        Random rand = new Random();
                         int accNumber = rand.nextInt()*50456;

                        System.out.println("Enter the deposit OpeningBalance Amount : ");
                        int openingBalance = input.nextInt();

                         try {
                             if (openingBalance <5000){
                                 throw new CheckBankOwnException("Current minimum balance should be 5000");
                             }
                         }catch (CheckBankOwnException e){
                             System.out.println(e.getMessage());
                         }

                        input.nextLine();
                        if (choice == 1) {
                            System.out.println( NewBankAccount.createAcc(accNumber,Hname, openingBalance));
                            accountCreated=true;
                        }else{
                            System.out.println("Enter the business name");
                            String bName = input.nextLine();

                            System.out.println( NewBankAccount.createAcc(accNumber,Hname, openingBalance, bName));
                            accountCreated=true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please check your input format should match");
                        input.nextLine();
                    }

                    break;
                case 1:
                    if (!accountCreated) {
                        System.out.println("Please create a new account first (Option 0).");
                    } else {
                    System.out.println(NewBankAccount.checkBalance());
                    }
                    break;
                case 2:
                    if (!accountCreated) {
                        System.out.println("Please create a new account first (Option 0).");
                    } else {
                    System.out.println("\nEnter your Deposit Amount: ");
                    int damount = input.nextInt();
//     Handling Exception
                    try {
                        NewBankAccount.deposit(damount);
                    }catch (CheckBankOwnException e) {
                        System.out.println(e.getMessage());
                        }
                    }

                    break;
                case 3:
                    if (!accountCreated) {
                        System.out.println("Please create a new account first (Option 0).");
                    } else {
                        System.out.println("\nEnter your Withdqw amount: ");

                        int wamount = input.nextInt();
//     Handling Exception
                        try {
                            NewBankAccount.withdrawAmount(wamount);
                        } catch (CheckBankOwnException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n---------Thank you for using our Banking System.-------------");
                    exit = false;
                    break;
                default:
                    System.out.println("\nPlease Choose options 1-3! TRY AGAIN ");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid input.");
            input.nextLine(); // clear invalid input
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (exit);

    }
}
