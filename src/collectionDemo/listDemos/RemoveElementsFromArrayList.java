package collectionDemo.listDemos;

import java.util.ArrayList;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList  arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        //Q. Why do we get this exception and what is the solution?
        for (Object obj:arrayList) {
            System.out.println(obj);
            if(obj.equals(10)){
                //object --> ConcurrentModificationException
                //index --> outOfBound
                arrayList.remove(Integer.valueOf(10));
            }
        }
        // Fail-fast fail-safe
        //ArrayList, LinkedList, vector, Stack[Push,pop, peek]
        //Cursors--> Iterator, ListIterator, Enumaration

    }
}
