package JavaBegginerLevel.AdvConcepts.OtherConcepts.Threads;

//synchronized method will handle the multiple threads running simultaneously and one will run and one more thread will be in waiting stage

class Counter{
     int count;
    public synchronized void increment(){
        count++;
    }
}

//class NewThread implements Runnable{
//    public void run(){
//        for (int i = 0; i < 1000; i++) {
//            Counter.increment();
//        }
//    }
//}

//class AnotherThread implements Runnable{
//    public void run(){
//        for (int i = 0; i < 1000; i++) {
//            Counter.increment();
//        }
//    }
//}

public class SynchronizedThreadController {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();


        Runnable ot1 = ()-> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Runnable ot2 = ()-> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread nt1 =  new Thread(ot1);
        Thread nt2 = new Thread(ot2);

       nt1.start();
       nt2.start();

        nt1.join();
        nt2.join();

        System.out.println(c.count);



    }
}
