package collectionDemo.queueRevise;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo5 {
    public static void main(String[] args) {
        Queue<Student> queue = new PriorityQueue<>((s1,s2)->s1.name.compareTo(s2.name));
//        Queue<Student> queue = new PriorityQueue<>((s1,s2)->s1.rollNumber- s2.rollNumber);
        queue.add(new Student(101,"mangesh"));
        queue.add(new Student(10,"shlok"));
        queue.add(new Student(1,"omkar"));
        queue.add(new Student(11,"shiv"));
        queue.add(new Student(19,"rohit"));

        int size = queue.size();
        for (int i = 1; i <= size ; i++) {
            System.out.println(queue.remove());
        }
    }
}
