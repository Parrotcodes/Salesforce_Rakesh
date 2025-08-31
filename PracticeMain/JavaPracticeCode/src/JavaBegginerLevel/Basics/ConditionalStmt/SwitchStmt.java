package JavaBegginerLevel.Basics.ConditionalStmt;

public class SwitchStmt {
    public static void main(String[] args) {
        int n =2;

//        Switch-case(old version)
        switch (n){
            case 1:
                System.out.println("Monday..");
                break;
            case 2:
                System.out.println("Tuesday..");
                break;
            case 3:
                System.out.println("Wednesday..");
                break;
            default:
                System.out.println("Thurs,Fri,Sat or Sund...");
        }

//        Switch-stmt (Latest version) --> int,string valid cases and shortend(break)
        String day ="M";

        switch (day){
            case "M","T":
                System.out.println("Monday and Tudesday wakeup 7AM...");
                break;
            case "S":
                System.out.println("Sunday...");
                break;
            default:
                System.out.println("remaining days....");
        }

//        shorten version of switch
        switch (day){
            case "M","T"-> System.out.println("Monday and Tudesday wakeup 7AM...");
            case "S" -> System.out.println("Sunday...");
            default -> System.out.println("remaining days....");
        }
//        switch as expression (yield -- for ':')

        String re = "";

//        switch (day){
//            case "Sat","sun" -> re = "10AM";
//            case "Mon","Tue" -> re = "8AM";
//            default -> re = "7AM";
//        }

       re = switch (day){
            case "Sat","sun" ->  "10AM";
            case "Mon","Tue" ->  "8AM";
            default -> "7AM";
        };
        System.out.println(re);


    }

}
