package AdvConcepts.OOPS.Encapsulation;

class Computer{
    private String name;
    private int price;

//    Constructor Name is same as Class Name -- it will not return anything
//    new Object creates --> by default constructor will call

    //Default Constructor
    public Computer() {
        price = 1500;
        name = "HP";
    }

    //parameterized constructor
    public Computer(String name, int price) {
        this.name = name;
        this.price = price;
    }

//   getter
    public String getName() {
        return name;
    }
//    setter
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Constructor {
    public static void main(String[] args) {
     Computer c = new Computer();

//     default constructor values
     System.out.println(c.getName()+" "+c.getPrice());

//     new constructor by passing argument values
     c.setName("Samsung");
     c.setPrice(1700);

     System.out.println(c.getName()+" "+c.getPrice());
    }
}
