package multithreading;

public class YeildDemo {
    public static void main(String[] args) throws InterruptedException {

       /* System.out.println(Thread.currentThread().getName() +
                " " + Thread.currentThread().getPriority());*/

        Thread thread1 =new Thread(()->{
            System.out.println("thread1");
        },"thread1");

        Thread thread2 =new Thread(()->{
            System.out.println("thread2");
        },"thread2");

        thread1.start();
        thread2.start();

        // main thread will wait for other threads with same or higher priority
        Thread.yield();

        for (int i = 0; i <10 ; i++) {
            System.out.println("i");
        }
    }
}
