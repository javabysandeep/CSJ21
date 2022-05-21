package multithreading;

public class ThreadWayDemo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setName("worker");
        worker.start();
        System.out.println("Inside the main method "+Thread.currentThread().getName());
    }
}
