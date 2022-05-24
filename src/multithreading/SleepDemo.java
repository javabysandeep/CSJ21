package multithreading;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {

                System.out.println(Thread.currentThread().getName());
            }
        },"t1");

        t1.start();
        t1.join(5000);

        //main thread job
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
