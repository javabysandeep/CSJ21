package multithreading;

class Worker  extends Thread{
    @Override
    public void run() {
        System.out.println("Inside the run method "+Thread.currentThread().getName());
    }
}