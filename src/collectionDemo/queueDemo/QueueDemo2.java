package collectionDemo.queueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {
    public static void main(String[] args) {
        Queue<Integer> queue =  new LinkedList<>();
        //add elements
        //queue.add(10);
        //queue.offer(20);
        //20, 10  --> |ticket
        //check who is there next but dont delete
        System.out.println(queue.peek());//null
        System.out.println(queue.element());//exception

        System.out.println(queue.poll());//null
        System.out.println(queue.remove());//exception
       }
}

