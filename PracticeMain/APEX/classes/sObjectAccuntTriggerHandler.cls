public class sObjectAccuntTriggerHandler {

    public void beforeInsert(List<Account> newList){
        for(Account acc : newList){
            acc.Description = 'This account was created by Trigger!';
        }
    }

    public void beforeUpdate(List<Account> newList, Map<Id, Account> oldMap){
        for(Account acc : newList){
            Account oldAcc = oldMap.get(acc.Id);
            if(acc.Name != oldAcc.Name){
                acc.Description = 'Account name changed from ' + oldAcc.Name + ' to ' + acc.Name;
            }
        }
    }

    public void beforeDelete(List<Account> oldList){
        for(Account acc : oldList){
            System.debug('Deleting Account: ' + acc.Name);
        }
    }

    public void afterInsert(List<Account> newList){
        System.debug('After Insert Trigger Fired');
        
        List<Task> tasksList = new List<Task>();
        for(Account acc : newList){
            
            tasksList.add(new Task(
            
                Whatid = acc.Id,
                Subject = 'Task created by trigger',
                Status = 'In Progress',
                Priority = 'Normal',
                ActivityDate = Date.today() + 3
                
            ));
        }
        
        if(!tasksList.isEmpty()){
             insert tasksList;
        }
       
    }

    public void afterUpdate(List<Account> newList, Map<Id, Account> oldMap){
        System.debug('After Update Trigger Fired');
        
        for(Account acc : newList){
            Account oldAcc = oldMap.get(acc.Id);
            
            if(acc.AnnualRevenue != oldAcc.AnnualRevenue){
   			    System.debug('Revenue changed for Account: ' + acc.Name);
            }
        }
    }

    public void afterDelete(List<Account> oldList){
        System.debug('After Delete Trigger Fired');
        for(Account acc : oldList){
            
            if(acc.Status__c == 'Suspeneded'){
                System.debug('Account deleted'+acc.Name +'And Id: '+acc.Id);
            }else{
                acc.addError('You can not Delete this account, only if your account satatus is Suspended then only You can delete ----> Saying Trigger:)');
            }

        }
    }

    public void afterUndelete(List<Account> newList){
        System.debug('After Undelete Trigger Fired');
        
        for(Account acc : newList){
           System.debug('Now Your account is restored from Recycle Bin: ' + acc.Name);
            
            Task deltedTask = new Task(
            	whatid = acc.Id,
                Subject = 'Task re-created restrored from recycle bin --> Saying trigger',
                Status = 'Not Started',
                Priority = 'High',
                ActivityDate = Date.today() + 3
                
            );
            
            insert deltedTask;

        }
        
        
    }
}