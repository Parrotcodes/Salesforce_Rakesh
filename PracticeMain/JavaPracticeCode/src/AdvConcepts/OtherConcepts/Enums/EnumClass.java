package AdvConcepts.OtherConcepts.Enums;

//similar to class but we can not extend
//class
enum LapTop{
    //objects
    MackBook(5000), XPS(4000), HP(3000),ThinkPad(2000), Dell(1000),Lenovo;

    private int price;

    //default constructor calls once only
    private LapTop() {
        price = 500;
    }

    private LapTop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        LapTop l = LapTop.HP;
        System.out.println(l);

        System.out.println(l+" : "+l.getPrice());

        for (LapTop lp : LapTop.values()){
            System.out.println(lp+ ": "+lp.getPrice()+" : "+lp.ordinal());
        }

    }
}
