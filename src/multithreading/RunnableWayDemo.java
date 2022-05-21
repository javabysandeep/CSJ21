package multithreading;

public class RunnableWayDemo {
    public static void main(String[] args) {
        WorkerRunnable worker = new WorkerRunnable();

        //anonymous way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Anonymous Inside the run method "+Thread.currentThread().getName());
            }
        };

        // Lambda way
        Runnable lambda = ()->{
            System.out.println(" Lambda Inside the run method "+Thread.currentThread().getName());
        };
        Thread thread = new Thread(lambda, "worker");
        thread.start();

        System.out.println("Inside the main method "+Thread.currentThread().getName());
    }
}

