interface MyInterface {
    private void helper() {
        System.out.println("Private helper method");
    }

    default void show() {
        helper(); // private method used here
        System.out.println("Default method");
    }
}

class My implements MyInterface{

}

public class Main {
    public static void main(String[] args) {
// <,>,=,==,!=, <=,>=,

        int x = 4;
        int y = 5;

        boolean re = x<y;
        boolean re2 = x == y;
        System.out.println(re);
        System.out.println(re2);

        My n = new My();
        n.show();
    }
}