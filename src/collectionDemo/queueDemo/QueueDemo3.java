package collectionDemo.queueDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo3 {
    public static void main(String[] args) {
        Queue<Integer> queue =  new PriorityQueue<>();
        queue.add(10);
        queue.add(1);
        queue.add(9);
        queue.add(11);
        queue.add(5);
        //   11, 10, 9, 5, 1--->
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

       }
}

