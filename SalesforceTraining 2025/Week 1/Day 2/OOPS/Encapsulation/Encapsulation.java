package OOPS.Encapsulation;


class BankAccount{
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
//	Getters
	public double GetBalance() {
		return balance;
	}
	
//	Setters
	public void deposit(double amount) {
		if(amount>0) balance += amount;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount newacc = new BankAccount(1000);
		newacc.deposit(100);
		newacc.GetBalance();
        System.out.println("Balance: " + newacc.GetBalance());


	}

}
