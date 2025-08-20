package AdvConcepts.OtherConcepts.Enums;

enum Categories{
    PartTime, FullTime, Intern;
}

public class EnumIFelseSwitch {
    public static void main(String[] args) {
        Status s = Status.Success;
        Categories c = Categories.Intern;
        System.out.println(s);
        System.out.println(c);

//        Categories
        if (c == Categories.Intern){
            System.out.println("Your an Intern");
        } else if (c == Categories.PartTime) {
            System.out.println("your PartTime Employee");
        } else {
            System.out.println("Your FullTime employee");
        }

//        Status
        if (s == Status.Running){
            System.out.println("Project is Running....");
        } else if (s == Status.Failed) {
            System.out.println("Project is Failed...");
        } else if (s == Status.Pending) {
            System.out.println("Project is Pending...");
        }else {
            System.out.println("Project is Success..");
        }


//        Simplifying code with Switch
        switch (c){
            case Intern:
                System.out.println("Your an Intern...Switch");
                break;
            case PartTime:
                System.out.println("your an PartTime...Switch");
            default:
                System.out.println("Your an FullTime...Switch");
                break;
        }

        //enhanced switch new version return type
        switch (s){
            case Failed -> System.out.println("Task is Failed");
            case Pending -> System.out.println("Task is Pending");
            case Running -> System.out.println("Task is Running");
            case Success -> System.out.println("Task is Success..");
        }
    }
}
