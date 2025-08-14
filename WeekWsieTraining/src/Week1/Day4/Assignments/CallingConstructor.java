package Week1.Day4.Assignments;

class Student{
    String name;
    int age;

    Student(){
//        override the constructor
        this("User",18);
        System.out.println("first constructor ......");
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Second constructor......");
    }

    void display(){
        System.out.println("Name: "+name+" "+"Age: "+age);
    }
}

class CallingConstructor{
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        Student s2 = new Student("Rakesh",20);
        s2.display();
    }
}