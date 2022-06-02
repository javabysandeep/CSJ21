package collectionDemo.listDemos;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(90);

        Iterator<Integer> iterator = list.iterator();
        ListIterator listIterator = list.listIterator();
        Enumeration enumeration = new Vector<>().elements();

        // to read, remove, from the given collection
        while (listIterator.hasNext()){
            /*if(iterator.next()==30){
                iterator.remove();
            }*/
            System.out.println(listIterator.next());
        }
        System.out.println(list);
    }
}
