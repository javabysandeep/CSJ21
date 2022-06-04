package collectionDemo.queueRevise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(11);
        queue.add(7);
       /* for (Integer i:queue) {
            System.out.println(queue.remove());
        }*/
        /*Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        int size = queue.size();
        for (int i = 1; i <= size ; i++) {
            System.out.println(queue.remove());
        }
    }
}
