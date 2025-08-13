package Week1.Week_1_Task.model;

public class Plans {
    String type;

    public Plans(){

    }

    public Plans(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plans{" +
                "type='" + type + '\'' +
                '}';
    }
}
