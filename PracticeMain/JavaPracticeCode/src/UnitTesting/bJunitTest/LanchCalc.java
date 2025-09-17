package UnitTesting.bJunitTest;

public class LanchCalc {
    static void main() {
        Calc testcal = new Calc();
        int result = testcal.divide(5,10);
        int result2 = testcal.multipy(3,4);

//        Verifying the result with my expected result by Assertions
//        Expected == actualResult
            //case - 1
        if (result==2){
            System.out.println("test passed!");
        }else {
            System.out.println("test case failed!");
        }

        int result3 = testcal.divide(5,0);
        //case - 3
        if (result==0){ //failed zero can't divide by any number
            System.out.println("test passed!");
        }else {
            System.out.println("test case failed!");
        }


    }
}
