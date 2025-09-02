package Week3.FinalTask;

import java.util.Comparator;

public class ISPPlans implements Comparable<ISPPlans>{
    //name,price,type,speed, validity
    private String  name;
    private double price;
    private String type;
    private int speed;
    private  int validity;

    public ISPPlans(String name, double price, String type, int speed, int validity) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.speed = speed;
        this.validity = validity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }


    public int getSpeed() {
        return speed;
    }

    public int getValidity() {
        return validity;
    }


    @Override
    public String toString() {
        return "ISPPlans{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", validity=" + validity +
                '}';
    }

    @Override
    public int compareTo(ISPPlans other) { //comparing by class itself
        return Double.compare(this.price,other.price); //default low -> high sorting
    }
}

//speed
//class SpeedComparator implements Comparator<ISPPlans>{
//    @Override
//    public int compare(ISPPlans speed1, ISPPlans speed2) {
//        return Integer.compare(speed1.getSpeed(),speed2.getSpeed()); //integer class by default implents comaprable
//    }
//}

//validity
//class ValidityComparator implements Comparator<ISPPlans>{
//    @Override
//    public int compare(ISPPlans date1, ISPPlans date2) {
//        return Integer.compare(date1.getValidity(),date2.getValidity());
//    }
//}

//Type
//class Typecomparator implements Comparator<ISPPlans>{
//    @Override
//    public int compare(ISPPlans type1, ISPPlans type2) {
//        return type1.getType().compareTo(type2.getType());
//    }
//}

//plan name
//class PlanNameComparator implements Comparator<ISPPlans>{
//    @Override
//    public int compare(ISPPlans name1, ISPPlans name2) {
//        return name1.getName().compareTo(name2.getName());
//    }
//}
