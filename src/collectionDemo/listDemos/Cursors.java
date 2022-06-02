package collectionDemo.listDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cursors {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(100);
        list.add(90);
        // To avoid ConcurrentModificationException
        //Iterator iterator = list.iterator();
        Iterator iterator = list.iterator();

    }
}
