package JavaBegginerLevel.AdvConcepts.Collection.Collections;

import java.util.ArrayList;
import java.util.Vector;

public class Testing {
    static void main() {
        ArrayList arrr = new ArrayList();
        arrr.add(12);
        arrr.add(12);
        arrr.add(12);
        arrr.add(12);
        arrr.add(12);
        System.out.println(arrr.size());


        Vector v = new Vector();
        v.add(34);
        System.out.println(v.capacity());

    }
}
