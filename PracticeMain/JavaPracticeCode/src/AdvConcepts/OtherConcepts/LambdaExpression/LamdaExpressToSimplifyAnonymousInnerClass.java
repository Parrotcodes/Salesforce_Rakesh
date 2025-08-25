package AdvConcepts.OtherConcepts.LambdaExpression;

//Lambda expression only work with functional Interface
//Lambda Expression is used to reduce the Anonymous InnerClass Code (short code)
// when we execute the file -- it will not create any Anonymous class files with unknown name
//                              \(no memory wastage, but increase the byte size of Main class a little bit)
@FunctionalInterface
interface A{
//    void show();
    void show(int x);
}

public class LamdaExpressToSimplifyAnonymousInnerClass {
    public static void main(String[] args) {
//Anonymous InnerClass
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("in A show Anonymous InnerClass");
//            }

//       Using Lambda Express -- short code (syntactically reducing code but stores as prev anonymous lengthy code)
//        A obj = () -> System.out.println("in A show Anonymous InnerClass");
        A obj2 = (int x) ->System.out.println("The squre: "+x);
//        obj.show();
        obj2.show(4);
    }
}
