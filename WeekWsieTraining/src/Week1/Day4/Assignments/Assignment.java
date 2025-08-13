package Week1.Day4.Assignments;

interface A
{
    int i = 111;
}

class B implements A
{
    void methodB()
    {

//        i = 222;

    }
}

class Assignement{
    public static void main(String[] args) {
        System.out.println("The problem in the code is we need to intialize the 'i' value before assingning value");
    }
}

