package Week2.keyWords;

public class INullCheckThrow {
    public static void printName(String name){
        if (name == null){
            throw new NullPointerException("Your name should not be empty!");
        }
        System.out.println("Your Name : "+name);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String userName = sc.nextLine();

        try {
            printName(null);
        }catch (NullPointerException e){
            System.out.println("Catch handling: "+e);
        }
        System.out.println("Next line");
    }
}
