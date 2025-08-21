package Week2.Week2_Task;

//1.First we need to check the RunTime error and Compile Time Errors
//2.Try to Handle those Errors using Exception Handling concept

//Problem:
// a. creating a ISP Management application which handling the Network providing bandLimits, user payment status checker

//______________________________________________________________________________________________________________________________

//Custom compileTimeError Exception
class InvalidCustomerException extends Exception{
    public InvalidCustomerException(String msg){
        super(msg);
    }
}

//Custom RunTimeError Exception
class paymentCheckException extends RuntimeException{
    public paymentCheckException(String status){
        super(status);
    }
}

class ProvideISPService{

    //validating customer
    public void validUser(String name) throws InvalidCustomerException{
        if(name == null|| name.trim().isEmpty()){
            throw new InvalidCustomerException("Customer name can not be empty!");
        }

        System.out.println("Customer "+name+ " is valid customer.");
    }


    //checkPaymentStatus validation
    public void paymentCheck(boolean status) throws paymentCheckException{
        if (!status){
            throw new paymentCheckException("payment status is failed! Try Again");
        }
        System.out.println("Payment processed is Successfully.");
    }


    //DataProvided by Company Handles dataUsedValidate + Limit provided
    public void usedData(int used,int maxLimit){
        if (used>maxLimit){
            throw new ArrayIndexOutOfBoundsException("Used : "+used+"GB out of "+maxLimit+"GB");
        }
        System.out.println("Data Used: "+used+" Out off "+maxLimit);
    }


    public void startService(String cname,boolean pymentstatus, int used,int limit) throws InvalidCustomerException{
        validUser(cname);
        paymentCheck(pymentstatus);
        usedData(used,limit);
        System.out.println("Service activated for "+cname);
    }
}

public class ISPMangagementExceptionHandling {
    public static void main(String[] args) {

//        InterNet Service Provider (ISP) Management
    ProvideISPService service = new ProvideISPService();

        // CASE 1: Genuine Customer
        try {
            System.out.println("--------- Genuine customer ---------");
            service.startService("Rakesh", true, 50, 100);
        } catch (Exception e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }

        // CASE 2: Invalid Customer Name
        try {
            System.out.println("--------- Invalid Name ---------");
            service.startService("", true, 60, 100);
        } catch (Exception e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }

        // CASE 3: Payment Failed
        try {
            System.out.println("--------- Payment Status ---------");
            service.startService("Rakhy", false, 20, 100);
        } catch (Exception e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }

        // CASE 4: Limit Exceeded
        try {
            System.out.println("--------- Limit Exceeded ---------");
            service.startService("Harry", true, 130, 100);
        } catch (Exception e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }

        System.out.println(" ********* ISP management Application is Done! ********");
    }
}

