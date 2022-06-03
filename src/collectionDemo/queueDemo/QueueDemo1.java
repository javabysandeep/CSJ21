package collectionDemo.queueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {
        Queue<Integer> queue =  new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(1);
        queue.add(2);
        queue.add(30);
        queue.offer(20);

        //30,2,1,20,10 --->
        System.out.println(queue);

        // removes the element from queue head, if the queue is empty then it will return the exception
        System.out.println(queue.remove());//remove from the head
        System.out.println(queue.remove());//remove from the head
        System.out.println(queue.remove());//remove from the head
        System.out.println(queue.remove());//remove from the head
        System.out.println(queue.remove());//remove from the head


        // removes the element from queue head, if the queue is empty then it will return null
        System.out.println(queue.poll());//remove from the head

        // if there is no element in the queue,then peek method returns the null
        System.out.println(queue.peek());//check the head but don't delete

        // if there is no element in the queue,then element method throws an exception
        System.out.println(queue.element());//check the head but don't delete
    }
}

