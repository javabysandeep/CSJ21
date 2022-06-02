package collectionDemo.listDemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
        //All those classes which implements List(I) allows duplicate data and follows insertion order.
        // Index concept is applicable for array based collection classes
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.toString());
        list.add(1,50);
        System.out.println(list);

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        list.remove(Integer.valueOf(40));
        arrayList.add("new list");
        arrayList.remove(0);
        System.out.println(arrayList);

        LinkedList linkedList = new LinkedList();
        linkedList.add(30);
        linkedList.add(330);
        linkedList.add(350);
        linkedList.add(350);
        linkedList.add(0, 433);
        System.out.println(linkedList);



        Vector vector = new Vector();
        vector.add("A");
        vector.add("B");
        vector.add(45);
        vector.add(32);
        System.out.println(vector);


    }
}
