package AdvConcepts.Strings;

public class StringBufferBuilder {
    public static void main(String[] args) {
//        StringBuffer (mutable) -- provides a lot of diff methods
        StringBuffer name = new StringBuffer("Rakesh");
        System.out.println(name);
        System.out.println(name.capacity()); // 16 space extra it will provide along with name
        System.out.println(name.length()); // 6
        System.out.println(name.append(" yadav"));

//        convert stringBuffer to string
        String n = name.toString();
        System.out.println(n);

//        StringBuilder -- It is similar to StringBuffer only but the difference is the Thread Safe
//                          StringBuffer having threadSafe but not in StringBuilder
    }
}
