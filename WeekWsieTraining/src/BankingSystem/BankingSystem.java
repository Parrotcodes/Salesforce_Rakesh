package BankingSystem;


import BankingSystem.accounts.BankAccount;
import BankingSystem.accounts.CurrentAccount;
import BankingSystem.accounts.SavingAccount;
import BankingSystem.CustomExceptions.*;

import java.util.Scanner;

//Steps:
// 1.Created separate packages and class files to Handle Type of Accounts and CustomExceptions
// 2.Created front-end interface like welcome,Menu options
// 3.Switch-case to handle menu options
// 4.Implemented all methods inside this main class
// 5.Created class file and intialized variable and generated constructors, and getInfo()
// 6.imported packages into main class
// 7.created object reference for the particular class based on user choice saving/current from option (line no - 110) it will use that class object
// 8.created custom exceptions and few will handled by the JavaRuntime Exception subclasses like type errors.
// 9.Hanlding exceptions using custom exception -> Saving a/c -- BankCheckException and Current a/c -- OverDraftException
// 10.Incase of any other exceptions java will handle by the final catch block Exception

public class BankingSystem {
    private static BankAccount account = null; // only one account allowed

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        System.out.println(" -------------- Welcome to ITT Bank --------------");

        while (!exit) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Create Account (Savings/Current)");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number 1-5.");
                continue;
            }

            switch (choice) {
                case 1:
                    if (account != null) {
                        System.out.println("Account already created!");
                        break;
                    }
                    createAccount(input);
                    break;
                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    depositMoney(input);
                    break;
                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    withdrawMoney(input);
                    break;
                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    account.displayAccountInfo();
                    break;
                case 5:
                    exit = true;
                    System.out.println("---------- Thank you for using ITT Bank! ---------------");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        input.close();
    }

    //creating a new account -- used Wrapper Classes instead of primitive DataTypes
    private static void createAccount(Scanner input) {
        System.out.print("Enter Account Holder Name: ");
        String name = input.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        int balance;
        try {
            balance = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid balance amount!");
            return;
        }

//        Based on chosen option the if-else will create object and use the class constructor
        System.out.print("Enter Account Type (1 - Savings, 2 - Current): ");
        int type = Integer.parseInt(input.nextLine());

//        Inside the savingAccount and Customer account using parameter constructor
//        --> arguments passed through user input will assign as parametrs of constructors
        if (type == 1) {
            account = new SavingAccount(accNo, name, balance);
            System.out.println("Savings Account created successfully!");
        } else if (type == 2) {
            //goto CurrentAccount constructor
            account = new CurrentAccount(accNo, name, balance);
            System.out.println("Current Account created successfully!");
        } else {
            System.out.println("Invalid account type!");
        }
    }

//    deposit method
    private static void depositMoney(Scanner input) {
        System.out.print("Enter deposit amount: ");
        try {
            int dep = Integer.parseInt(input.nextLine());
            if (dep <= 0) {
                System.out.println("Deposit amount must be positive!");
            } else {
                // it will goto BankAccount class and using deposit method
                account.deposit(dep);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount!");
        }
    }

//    withdraw method -- implemented abstract
    private static void withdrawMoney(Scanner input) {
        System.out.print("Enter withdrawal amount: ");
        try {
            int wamount = Integer.parseInt(input.nextLine());
            if (wamount <= 0) {
                System.out.println("Negative amount not valid! Withdrawal amount must be positive!");
            } else {
                account.withdraw(wamount);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount!");
        } catch (BankCustomExceptions e) {
            System.out.println("Error: " + e.getMessage());
        } catch (overDraftException e){
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
