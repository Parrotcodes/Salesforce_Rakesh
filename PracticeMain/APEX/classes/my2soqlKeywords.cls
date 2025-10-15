public class my2soqlKeywords {
    public static void keywords(){
        //SOQL Keywords
        
        //IN (which includes in List)
        List<String> names = new  List<String>{'rakesh','jhon','amazon','IIT'};
        
        List<Account> namesList = [select id,name from Account where name IN :names];
        System.debug('IN List Of Accounts: '+namesList);
        
        Set<ID> myIds = new Set<ID>{'001gL00000Gtt7aQAB','001gL00000Gtt7dQAB'};
            
        List<Account> nameSetList = [Select id,name from Account where id IN :myIds];
        System.debug('IN ID of Accoutns: '+nameSetList);
        
        //Note: Map can not be used with IN keyword because it is not an iterable collection.
        //
        
        
        
        //NOT IN (except from the list)
        List<String> notNames = new  List<String>{'rakesh','jhon','Amazon','IIT'};
        
        List<Contact> notNamesList = [select id,name, email from contact where name NOT IN :notNames];
        System.debug('Not in List Of Contacts: '+notNamesList);
        
        
        //ORDER BY (ordered format)
        //ASC,DESC,NULLS FIRST,NULLS LAST
        
        //List<Opportunity> opp = [Select name, amount from Opportunity order by amount asc];
        //List<Opportunity> opp = [Select name, amount from Opportunity order by amount desc];
        //List<Opportunity> opp = [Select name, amount from Opportunity order by amount NULLS FIRST];
        List<Opportunity> opp = [Select name, amount from Opportunity order by amount NULLS LAST];
        System.debug('Opportunities ORDER BY: '+opp);
        
        for(Opportunity op: opp){
            System.debug('Amount '+op.amount);
        }
		        
        
        //GROUP BY (grouping with specific condition)
        //NOte: we need to pass ID inside the COUNT while using GROUP BY
        // 		We need to select filed 'name' which we are grouping the result  same as group by 'name'
        
        //AggregateResult stageOpp = [Select StageName,Count(ID) from Opportunity GROUP BY stageName];
        //AggregateResult stageOpp = [Select StageName,AVG(amount) from Opportunity GROUP BY stageName];
        //AggregateResult stageOpp = [Select StageName,MAX(Amount) from Opportunity GROUP BY stageName];
        //System.debug('Opportunities GROUPBY StageName: '+stageOpp);
        
        
        //Aggreagate Functions with GROUP BY, like
        //1.AVG() -- avg of among the entire opportuinities
        //2.COUNT() -- total count
        //3.SUM() -- total price
        //4.MAX() -- max amount (within particular stage)
        //5.MIN() -- min amount
        //6.COUNT_DISTINCT()
        //
        //
        
        //LIKE 
        //----------wild cards----------- (percentage(%) & Underscore(_))
            //'name'
            //'name%'
            //'%name'
            //'%name%'
            //'_ame' => _ -(a-z)
        List<Account> wildAcc = [Select id, name from Account where name like 'Ama%'];
        List<Account> wildAcc2 = [Select id, name from Account where name like '%ma%'];
        List<Account> wildAcc3 = [Select id, name from Account where name like '_mazon'];
        

        
        
        //AND (Inbetween Range) & OR(either of one match) --> Concatinate two conditions together
        //
    List<Opportunity> app = [Select StageName,amount from Opportunity where amount>=10000 AND StageName='Closed Won'];
    List<Opportunity> app2 = [Select StageName,amount from Opportunity where amount<10000 OR StageName='Closed lost'];

        
        
        
        }

}