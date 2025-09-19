package WeeklyReviewTask12.NewAccount;

public interface BankName {
    String bankName = "ITT Bank"; // default final and static
}

interface BankMethods{
    void createAcctount(); // default public abstract
    void deposit();
    void checkBalance();
    void withdraw();
}

interface typeAccount{
    void savingAccount();
    void CurrentAccount();
}