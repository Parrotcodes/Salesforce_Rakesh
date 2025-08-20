package AdvConcepts.OOPS.Encapsulation;

//private -- is only accessible on the same class (outside world/class no access)
//Getters & Setters - to get or set data
class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
//        obj.name="Rakesh";
//        obj.age = 20;

        obj.setName("Rakhy");
        obj.setAge(18);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }
}
