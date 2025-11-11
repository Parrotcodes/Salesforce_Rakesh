/**
 * @description       : 
 * @author            : ChangeMeIn@UserSettingsUnder.SFDoc
 * @group             : 
 * @last modified on  : 11-09-2025
 * @last modified by  : ChangeMeIn@UserSettingsUnder.SFDoc
**/
@isTest
public class ApexTesting {
    @isTest
    static void myTest(){
        Integer num  = 10;
        System.debug('My Testing file');
        System.assertEquals(Integer.valueOf(10),num,'Not equal');
    }

}