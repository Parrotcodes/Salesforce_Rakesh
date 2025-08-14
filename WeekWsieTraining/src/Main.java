interface Base{
    double PI = 3.14;

     default void Engine(){
        System.out.println("Enginee required...");
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    }
}