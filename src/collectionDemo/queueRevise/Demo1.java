package collectionDemo.queueRevise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(11);
        queue.add(7);
       /* for (Integer i:queue) {
            System.out.println(queue.remove());
        }*/
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
