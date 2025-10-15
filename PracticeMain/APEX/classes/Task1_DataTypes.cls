public class Task1_DataTypes {
    public static void employeeDetails(){
        Integer empId = 101;
        String name = 'Rakesh';
        Decimal salary = 75500.75;
        Boolean isActive = true;
        Date joiningDate = Date.newInstance(2025, 8, 04);
        Datetime currentDateTime = Datetime.now();

        // PRint Employee Info
        System.debug('Employee ID: ' + empId);
        System.debug('Name: ' + name);
        System.debug('Salary: ' + salary);
        System.debug('isActive: ' + isActive);
        System.debug('joiningDate: ' + joiningDate);
        System.debug('currentDateTime: ' + currentDateTime);

    }
    
    public static void typeCastingDemo(){
        Integer intval = 50;
        System.debug(String.valueOf(intval)); //int to string
        
        String strval = '100';
        System.debug(Integer.valueOf(strval));//str to int
        
        Double doubleval = 99.99;
        System.debug(Decimal.valueOf(doubleval));//double to decimal
        
        Decimal decimalval = 88.99;
        System.debug(String.valueOf(decimalval));//decimal to string        
	}
    
    public static void daysDifference(){
        
        Date joinigDate = Date.newInstance(2024,10,12);
        
        Date today = Date.today();  
    	
        //daysbetween diff
        Integer days = today.daysBetween(joinigDate);
        
        System.debug('Joining Date: ' + joinigDate);
        System.debug('Today: ' + today);
        System.debug('Days Difference: ' + days);
    }
    
}