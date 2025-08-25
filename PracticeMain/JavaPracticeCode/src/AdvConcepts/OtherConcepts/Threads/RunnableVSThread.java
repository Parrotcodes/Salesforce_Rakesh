package AdvConcepts.OtherConcepts.Threads;

// extending Thread with Class is not a good Idea.Because, we can not implement Multiple Inheritance in Java.
// so, we can implement Thread which is child of Runnable is Good Idea.
//        Now, to Run our Thread start() we need Thread objects which takes class objects which is reference of Runnable as an arguments.
//Runnable interface not having Thread Class.so we created Thread Objects
//we can use Anonymous classes instead of Normal classes with this we don't need to create object for class anymore, and we can implement Lambda Expression also to further shorten code.

// Threads along with mutation is not a good idea. It will cause issue (Eg: changing one variable value with two threads (BANK ATM))

// -----Thread Safe---> only one thread can work with at one point ( show() -> t1 or t2 but not both simultaneously)

//class AA implements Runnable{
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hii");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class AB implements Runnable{
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class RunnableVSThread {
    public static void main(String[] args) {
     //Anonymous class into Lambda Expression
        Runnable obj = ()-> {
                 for (int i = 0; i < 10; i++) {
                     System.out.println("Google");
                     try {
                         Thread.sleep(10);
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
             }
     };

     Runnable obj2 = ()-> {
         for (int i = 0; i < 10; i++) {
             System.out.println("Spotify");
             try {
                 Thread.sleep(10);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     };

     Thread t1 = new Thread(obj);
     Thread t2 = new Thread(obj2);

     t1.start();
     t2.start();
    }
}
