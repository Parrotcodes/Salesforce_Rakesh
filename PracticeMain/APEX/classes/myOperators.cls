public class myOperators {
    
    public static void Operators(){
        //add(+) & subtract(-)
    
        Integer x = 10;
        Double  y = 9.3;
        
        System.debug(x-y); //double
        System.debug(x+y); //double
        
        
        //Date d = new Date(2024,06,15);
        //System.debug(d+x); // next 10 days -> (2024,06,25)
        //System.debug(d-x); //goes back to before date
        
        
        String s1 = 'hey';
        String s2 = 'nice!';
        
        System.debug(s1+s2); //String
        
        Integer i = 10;
        System.debug(s1+i); //concatinate -> hey 10
        
        
        //-----------------Equality (==) Operator-----------------
        //String - Case insensitive (ABC == abc -> True)
        //ID - Case Sensative ('3424GBR' == '3424gbr' -> Flase)
        
        }
}