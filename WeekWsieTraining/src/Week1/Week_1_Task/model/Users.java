package Week1.Week_1_Task.model;

public class Users {
    private String name;
    private int age;
    private String userType;


    public Users() {
    }

    public Users(String name, int age, String userType) {
        this.name = name;
        this.age = age;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userType='" + userType + '\'' +
                '}';
    }
}
