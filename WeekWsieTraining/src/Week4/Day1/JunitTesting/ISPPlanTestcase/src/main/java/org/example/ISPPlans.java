package org.example;

public class ISPPlans implements Comparable<ISPPlans> {
    private String name;
    private double price;
    private String type;
    private int speed;
    private int validity;

    public ISPPlans(String name, double price, String type, int speed, int validity) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.speed = speed;
        this.validity = validity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getType() { return type; }
    public int getSpeed() { return speed; }
    public int getValidity() { return validity; }

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
    public int compareTo(ISPPlans other) {
        return Double.compare(this.price, other.price);
    }
}
