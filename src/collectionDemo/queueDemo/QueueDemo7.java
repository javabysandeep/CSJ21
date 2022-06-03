package collectionDemo.queueDemo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo7 {
    public static void main(String[] args) {
        Queue<String> queue =  new PriorityQueue<>((s1,s2)->s2.compareTo(s1));
        queue.add("Manjusha");
        queue.add("Anjali");
        queue.add("Bhavana");
        queue.add("Rasika");
        queue.add("Mangesh");
        queue.add("Omkar");
        queue.add("Anjali");
        queue.add("Bhavana");
        // Rasika,Omkar  Manjusha, Mangesh Bhavana Anjali
        /*for (String str:queue) {
            System.out.println(queue.remove());
        }*/
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("After deletion "+queue);

       }
}

