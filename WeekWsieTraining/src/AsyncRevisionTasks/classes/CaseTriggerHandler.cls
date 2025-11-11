public class CaseTriggerHandler {
    public static void handleBeforeDeleteActivities(List<Case> allCases){
        Id currentgetProfileId = UserInfo.getProfileId();
        Id systemAdminId = [select id,name from profile where name = 'System Administrator' limit 1].id;
        
        for(Case existingcase : allCases){
            if(systemAdminId != currentgetProfileId){
                existingcase.addError('You can not delte cases. Only Admin can Delete');
            }
        }
    }

}