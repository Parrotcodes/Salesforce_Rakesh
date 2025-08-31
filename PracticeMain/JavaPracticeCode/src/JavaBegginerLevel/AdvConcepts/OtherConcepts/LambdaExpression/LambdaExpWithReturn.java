package JavaBegginerLevel.AdvConcepts.OtherConcepts.LambdaExpression;

//advancedConcepts
//Lambda expression as arguments -- in collection
//Lambda expression only work with functional Interface
@FunctionalInterface
interface Add{
    //return type int
    int add(int i,int j);
}
public class LambdaExpWithReturn {
    public static void main(String[] args) {
//        Add obj = new Add() {
//            @Override
//            public int add(int i,int j) {
//                return i+j;
//            }
//        };

//        with Lambda Expression above code -- shorten as below
        Add obj = (i, j) -> i+j;

        int re = obj.add(5,3);
        System.out.println(re);
    }
}
