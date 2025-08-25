package BankingSystem.accounts;


public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected int balance;  // subclasses can access

    private static String bankName = "ITT Bank";

    public BankAccount(String accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    protected BankAccount() {
    }

    public abstract void withdraw(int amount) throws Exception;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public int getBalance() { return balance; }

    public static String getBankName() { return bankName; }

    public void displayAccountInfo() {
        System.out.println("Bank: " + bankName); // static keyword used
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
