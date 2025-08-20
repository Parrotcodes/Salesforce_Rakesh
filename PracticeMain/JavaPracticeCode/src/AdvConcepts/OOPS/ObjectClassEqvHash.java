package AdvConcepts.OOPS;

import java.util.Objects;

class Laptop{
    String name;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(name, laptop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

public class ObjectClassEqvHash {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.name = "Lenovo";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.name ="Lenovo1";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);
        System.out.println("Equals: "+result);
        System.out.println("Object1: "+ obj1.toString());
        System.out.println("Object2: "+ obj2.toString());
    }
}
