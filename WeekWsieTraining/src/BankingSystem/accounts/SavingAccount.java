package BankingSystem.accounts;

import BankingSystem.CustomExceptions.BankCustomExceptions;


public class SavingAccount extends BankAccount {
    private int accountNumber;
    private String holderName;
    protected int balance;
    private final int Min_balance = 1000;

    public SavingAccount(int accNo, String name, int balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public void withdraw(int amount) throws BankCustomExceptions {
        if (balance - amount < Min_balance) {
            throw new BankCustomExceptions(
                    "Withdrawal failed! Minimum balance of " + Min_balance + " must be maintained."
            );
        }
        balance -= amount;
        System.out.println("Withdrawal Successful: " + amount);
        System.out.println("Current Balance: " + balance);
    }
}
