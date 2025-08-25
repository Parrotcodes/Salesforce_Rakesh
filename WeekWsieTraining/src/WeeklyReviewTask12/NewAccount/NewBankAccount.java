package WeeklyReviewTask12.NewAccount;

public class NewBankAccount {
    private static int accNumber;
    private static String name;
    private static int minBalance;
    private static boolean isSaving;
    private static boolean isCurrent;

    private static final int Saving_MinBalance = 1000;
    private static final int CURRENT_LIMIT = 5000;

    public NewBankAccount() {
    }

    //default constructor -- Saving Account
    private NewBankAccount(int accNumber,String name, int minBalance) throws CheckBankOwnException {
        this.accNumber = accNumber;
        this.name = name;
        this.isSaving = true;
        this.isCurrent = false;

        if (minBalance < Saving_MinBalance) {
            throw new CheckBankOwnException("Saving account requires minimum opening balance of Rs." + Saving_MinBalance);
        }else {
        this.minBalance = Saving_MinBalance;
        }
    }

    // Business -- current Account
    private NewBankAccount(int accNumber,String name, int minBalance, String businessName) {
        this.accNumber = accNumber;
        this.name = name;
        this.isSaving = false;
        this.isCurrent = true;
        if (minBalance<0){
            //default balance - business account type
            this.minBalance = 0;
        }else {
        this.minBalance = minBalance;
        }
    }

    //  create a new account -- case 0
    public static String createAcc(int accNumber, String name, int amount){
       try {
           NewBankAccount obj = new NewBankAccount(accNumber, name, amount);
       }catch (CheckBankOwnException e){
           System.out.println(e.getMessage());
       }
        return "Successfully created saving account! Account Number: " + accNumber;
    }

    public static String createAcc(int accNumber, String name, int amount, String bName){
        NewBankAccount obj = new NewBankAccount(accNumber,name, amount, bName);
        return "Successfuly created your current account!\n your acc numbers is : " + accNumber;
    }


    //balance check -- case 1
    public static String checkBalance(){
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Current Balance: "+minBalance);
        return "";
    }

    //deposit amount -- case 2
    public static void deposit(int amount) throws CheckBankOwnException{
        if (amount <= 0) {
            throw new CheckBankOwnException("Deposit amount must be greater than zero!");
        }else{
            minBalance += amount;
            System.out.println("Deposited Amount: "+amount);
            System.out.println("Current Balance: Rs." + minBalance);

        }
    }

    //withdraw amount -- case 3
    public static void withdrawAmount(int amount) throws CheckBankOwnException{
//        if (amount<=0){
////            System.out.println("No money - 0 bank balance");
//            throw new CheckBankOwnException("Your amount should not be negative.");
//        } else if (amount>minBalance) {
//            System.out.println("No SUfficient money! Low balance"+minBalance);
//        }
        if (isSaving) {
            if (minBalance - amount < Saving_MinBalance) {
                throw new CheckBankOwnException("Withdrawal denied! Savings Account must maintain minimum balance of Rs." + Saving_MinBalance);
            }
        }

        if (isCurrent) {
            if (minBalance - amount < CURRENT_LIMIT) {
                throw new CheckBankOwnException("Withdrawal denied! Current Account limit of Rs." + CURRENT_LIMIT + " exceeded.");
            }
        }

            minBalance -= amount;
            System.out.println("Your withdrqw successfully Rs."+amount);
            System.out.println("You current balance is "+minBalance);

    }

//    case -- 4 --> Exit
}
