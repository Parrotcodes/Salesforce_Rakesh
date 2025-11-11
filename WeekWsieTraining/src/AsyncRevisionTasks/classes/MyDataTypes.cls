public class MyDataTypes {
    public static void DataTypes(){
        //Data Types
        //
        //Integer - integer & long
        integer num = 10;
        
        long bignum = 897789787894534L;
        
        System.debug('integer: '+num);
        System.debug('Long: '+bignum);
        
        //Float - double & decimal
        double f1 = 89.90;
        
        decimal d1 = 8789.20;
        System.debug('Float: '+ f1);
        System.debug('Decimal: '+ d1);
        
        //String
        String s1 = 'Rakesh';
        String s2 = 'Chil';
        
        String name = s1 + s2;
        System.debug(name);
        
        //Date
        Date d = Date.today(); //current Date        
        d = Date.newInstance(2020,05,01);       
        
        System.debug('Date:'+d);
        System.debug(d.toStartOfWeek());
        
        //Time

		Time t1;
		t1 = Time.newInstance(16,40,00,00);
        
        System.debug(t1.addHours(2));
        System.debug('Time: '+t1);
        
        
        //DateTime
        DateTime dt = DateTime.newInstance(22,05,01,04,00,00);
        
        System.debug(dt);
        System.debug(DateTime.now());
        
        
        //Boolean  
       boolean yes = true;
       boolean nope = false;
       
       boolean check = 5>10;
        
       System.debug(yes);
       System.debug(nope);
       System.debug(check); //False
        
        
        //Rules of conversion
        //heirarchy of numbers: Integer < LONG < DOUBLE < DECIMAL
        //
        
        //ID myid = '78Fd8dfg9444GXY'; //IDs can always be assinged to String
        //String id = myid;
        //System.debug(id);
        ID accId = '001gL00000QJLrR'; // Account record ID
		Account acc = [SELECT Name FROM Account WHERE Id = :accId];//dynamic var
		System.debug('Account Name: ' + acc.Name);

        
        //ENUM - Custom DataType
        SeasonEnum myenum = SeasonEnum.summer;
        System.debug(myenum);
        
    }
}