@isTest
public class ApexTesting {
    @isTest
    static void myTest(){
        Integer num  = 10;
        System.debug('My Testing file');
        System.assertEquals(Integer.valueOf(10),num,'Not equal');
    }

}