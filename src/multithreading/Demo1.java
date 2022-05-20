package multithreading;

public class Demo1 {
    public static void main(String[] args) {
        Task task = new Task();
        task.setName("taskThread1");
        task.start();

        Task task2 = new Task();
        task2.setName("taskThread2");
        task2.start();


        // main method is the job of main thread
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        //Another way to create thread.
        Runnable runnable = ()->{
            //run method overridden
            for (int i = 0; i <9 ; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(runnable,"LambdaThread");
        thread.start();
    }
}

class Task extends Thread {
    @Override
    //job of custom thread.
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}