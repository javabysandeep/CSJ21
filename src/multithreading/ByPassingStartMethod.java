package multithreading;

public class ByPassingStartMethod {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" is executing run method");
        },"thread1");
        thread.run();
    }
}
