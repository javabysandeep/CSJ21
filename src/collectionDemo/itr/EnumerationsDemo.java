package collectionDemo.itr;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationsDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
