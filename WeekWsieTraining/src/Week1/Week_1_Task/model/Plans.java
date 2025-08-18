package Week1.Week_1_Task.model;

public class Plans {
    private String name;
    private double price;
    private String benefits;

    public Plans(String name, double price, String benefits) {
        this.name = name;
        this.price = price;
        this.benefits = benefits;
    }

    public String toString() {
        return "\nPlanName: " + name + "\nPrice: " + price + "\nBenefits: " + benefits + ".";
    }
}