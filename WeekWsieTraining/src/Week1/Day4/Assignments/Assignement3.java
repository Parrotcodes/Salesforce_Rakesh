package Week1.Day4.Assignments;

class Assignment3{
    void demoFunc(int n){
        if(n<10) return;
        n++; //this line will not excute if the above condition is correct bcz of return
    }

    public static void main(String[] args) {
        System.out.println("It will exit the code once return line excuted");
        Assignment3 n = new Assignment3();
        n.demoFunc(5);

    }
}