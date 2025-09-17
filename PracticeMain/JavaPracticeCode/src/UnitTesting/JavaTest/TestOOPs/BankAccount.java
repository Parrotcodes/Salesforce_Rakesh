package UnitTesting.JavaTest.TestOOPs;

//Encapsulation
public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depoist(int amount){
       if(amount>0) {
           balance += amount;
       }
    }

    public void withdraw(int amount){
       if (amount >0 && amount<=balance){
           balance -= amount;
       }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
