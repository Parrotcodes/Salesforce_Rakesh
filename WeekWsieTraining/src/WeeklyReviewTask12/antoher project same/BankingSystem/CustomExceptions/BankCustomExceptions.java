package BankingSystem.CustomExceptions;

//Using this Custom Exception for Handling all cases except overDraft
public class BankCustomExceptions extends Exception {
    public BankCustomExceptions(String message) {
        super(message);
    }
}

