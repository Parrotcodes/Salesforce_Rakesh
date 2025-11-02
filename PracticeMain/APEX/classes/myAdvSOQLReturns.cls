public class myAdvSOQLReturns {
    public static void ReturnTypes(){
        //SOQL RETURN TYPES
        	// 1.List<sObjects>
        	// 2.sObject
        	// 3.Integer (aggregate fun - (FUNCTIONS return int) - SUM, MAX, MIN, COUNT, COUNT_DISTINT(this will result same no.of filed values unique amount values present))
        	// 4.AggregateResult -- return object of aggregate results
        	// 
        	// 
        	//changed
        List<AggregateResult> ar = [select COUNT_DISTINCT(amount) total from Opportunity];
        Integer res = (Integer)ar[0].get('expr0'); // this we can use in Apex to use the return value
        System.debug('Distinct Amount Count return value: ' + res);

    }
}