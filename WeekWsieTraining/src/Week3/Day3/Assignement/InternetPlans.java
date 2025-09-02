package Week3.Day3.Assignement;

class InternetPlans implements Comparable<InternetPlans>{
    private int price;
    private String planName;

    public InternetPlans(int price, String planName) {
        this.price = price;
        this.planName = planName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String toString() {
        return "InternetPlans{" +
                "price=" + price +
                ", planName='" + planName + '\'' +
                '}';
    }

    public int compareTo(InternetPlans otherplan) {
       return Integer.compare(this.price,otherplan.price);
    }
}
