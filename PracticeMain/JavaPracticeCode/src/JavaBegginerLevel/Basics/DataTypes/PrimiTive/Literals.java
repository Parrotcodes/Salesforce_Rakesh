package JavaBegginerLevel.Basics.DataTypes.PrimiTive;

public class Literals {
    public static void main(String[] args) {
//        literals
        int num = 0b101;//(binary) 5
        int n  = 10_00_00_00;

        double i = 56;//int -> double conv

        char c = 'a';
        c++; //can increase bcz it's literal

//Type Conversion and Casting
        byte b = 127;
        int a = 256;
        b= (byte) a;

        float ff = 45.99f;
        int y = (int) ff;
        System.out.println(y); //loss of data
    }
}
