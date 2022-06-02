package collectionDemo.listDemos;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Array {
    public static void main(String[] args) {

        //duplicate, diff, null
        Vector vector = new Vector();
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.add("String");
        vector.add(true);
        vector.add(null);
        vector.add(10.5f);
        vector.add('A');
        System.out.println(vector);
    }
}
