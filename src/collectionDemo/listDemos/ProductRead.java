package collectionDemo.listDemos;

import java.util.*;

public class ProductRead {
    public static void main(String[] args) {
        Vector list = new Vector();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(1560);
        list.add(15260);

        /*for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }*/
       /* for (Object obj:list) {
            System.out.println(obj);
        }*/

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Enumeration enumeration = list.elements();
        while (enumeration.hasMoreElements()){
            System.out.println("Enu "+enumeration.nextElement());
        }
    }
}
