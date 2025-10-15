public class Mini_Task_BankAccount {
        Integer accid;
        String holderName;
        Decimal balance;
        Boolean isActive;
         
         public Mini_Task_BankAccount(Integer uid,String name, Decimal intialBalance, Boolean status){
             accid = uid;
          	holderName = name;
             balance = intialBalance;
             isActive = status;
         }
    
    public void deposit(Decimal amount) {
        if (isActive) {
            balance += amount;
            System.debug('Deposited: ' + amount);
            System.debug('New Balance: ' + balance);
        } else {
            System.debug('Account is not active. Deposit not allowed.');
        }
    }
    
    public void withdraw(Decimal amount){
        if(!isActive){
            System.debug('Account is not active. Withdrawal not allowed');
        }
        
        if (amount <= balance) {
            balance -= amount;
            System.debug('Withdrawn: ' + amount);
            System.debug('Remaining Balance: ' + balance);
        } else {
            System.debug('Insufficient balance. Withdrawal failed.');
        }
    }
    
    public void displayDetails() {
        System.debug('Account Holder: ' + holderName);
        System.debug('Balance: ' + balance);
        System.debug('Is Active: ' + isActive);
    }
}