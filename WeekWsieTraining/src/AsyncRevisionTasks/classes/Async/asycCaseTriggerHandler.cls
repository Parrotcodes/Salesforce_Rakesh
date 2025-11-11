public class asycCaseTriggerHandler {
    
    @future
    public static void createFollowUpTasksAsync(List<Id> caseIds) {
        
        //crating a task
        List<Task> tasks = new List<Task>();
        for (Case c : [select id from Case where Id IN :caseIds ]) {
            tasks.add(new Task(
                WhatId = c.Id,
                Subject = 'Follow-up Task - From @Future Method ',
                Status = 'Not Started',
                Priority = 'Medium'
            ));
        }
        
        
        if (!tasks.isEmpty()) {
            insert tasks;
        }
    }
}