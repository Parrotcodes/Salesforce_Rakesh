package JavaBegginerLevel.Basics.Loops;

public class WhileLoop {
    public static void main(String[] args) {
//        while(true){}
        int x = 0;
        while (x <= 5){ //infinite
            System.out.println("Hi "+x);
            x++;
        }
        System.out.println("Loop exits at X: "+x);

//        Nested While loop
        int i =0;
        int j = 0;
        while (i<=5){
            System.out.println("Main loop i: "+i);
            while (j<=3){
                System.out.println("Inside loop j: "+j);
                j++;
            }
            i++;
        }

    }
}
