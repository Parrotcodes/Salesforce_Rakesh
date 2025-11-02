@isTest
public class Test1 {
    @isTest
    static void MathTest(){
        Integer res = TestClass1.MathUitlAdd(10, 20);        
        
        System.assertEquals(30,res,'failed bro');
        //System.assertEquals(300,res,'failed bro');

    }    
}