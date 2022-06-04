package collectionDemo.queueRevise;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>((s1,s2)->s1.length()-s2.length());
        queue.add("spring");
        queue.add("core java");
        queue.add("hibernate");
        queue.add("advance java");
        queue.add("project");

        int size = queue.size();
        for (int i = 1; i <= size ; i++) {
            System.out.println(queue.remove());
        }
    }
}
