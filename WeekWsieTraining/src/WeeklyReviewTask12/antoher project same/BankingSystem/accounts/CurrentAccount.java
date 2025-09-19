package BankingSystem.accounts;

import BankingSystem.CustomExceptions.overDraftException;


public class CurrentAccount extends BankAccount {
    private int accountNumber;
    private String holderName;
    protected int balance;
    private final int overdraftLimit = 5000;

    public CurrentAccount(int accNo, String name, int balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public void withdraw(int amount) throws overDraftException {
        if (amount > balance + overdraftLimit) {
            throw new overDraftException(
                    "Overdraft limit exceeded! You cannot withdraw " + amount
            );
        }
        balance -= amount;
        System.out.println("Withdrawal Successful: " + amount);
        System.out.println(" Current Balance: " + balance);
    }
}
