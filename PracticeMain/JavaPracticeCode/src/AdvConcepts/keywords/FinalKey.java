package AdvConcepts.keywords;

//final -- can be used with (variable, method, class) --- (CONSTANT) //making class final-> stopping inheritance

//final class BCalc
class BCalc{
    //with final method no one can override the method - copyright authority
    public final void show(){
        System.out.println("By InTimeTec");
    }

    public int square(int x){
        return x*x;
    }
}

//another company copying same technique
class AdvCalc extends BCalc{
//    public void show(){
//        System.out.println("By Rakhy");
//    }

    public int square(int x){
        return x*x;
    }

}

public class FinalKey {
    public static void main(String[] args) {
//        final variable
        final int num =8;
        System.out.println(num);

        AdvCalc cal = new AdvCalc();
        cal.show();

        System.out.println(cal.square(5));

    }
}
