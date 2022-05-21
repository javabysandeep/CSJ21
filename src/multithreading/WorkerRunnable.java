package multithreading;

public class WorkerRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside the run method "+Thread.currentThread().getName());
    }
}
