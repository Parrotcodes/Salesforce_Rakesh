package Week3.Day5.CRUD;

// SCHEMA DBMS
/*
CREATE TABLE customer(
        customerid int AUTO_INCREMENT PRIMARY KEY,
        cname varchar(50) not null,
        cemail varchar(50) UNIQUE not null,
        cage int DEFAULT 18,
        cphone varchar(10) not null,
        cmarried varchar(10),
        cgender varchar(5)
    );
            */
public class CustomerBluePrint {
    protected static final String companyName= "Amazon";
    private int id;
    private String name;
    private String email;
    private int age;
    private int phone;
    private String married;
    private String gender;

    public CustomerBluePrint(int id, String name, String email, int age, int phone, String married, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.married = married;
        this.gender = gender;
    }

    public CustomerBluePrint(int id, String name, String email, int phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CustomerReq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", married='" + married + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
