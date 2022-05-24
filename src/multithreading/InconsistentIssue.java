package multithreading;

public class InconsistentIssue {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        Thread thread1 = new Thread(()->{
            for (int i = 1; i <=10000 ; i++) {
                resource.changeCounter();
            }
        },"thread1");

        Thread thread2 = new Thread(()->{
            for (int i = 1; i <=10000 ; i++) {
                resource.changeCounter();
            }
        },"thread2");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Total count "+resource.counter);
    }
}
class Resource{
    int counter = 0;
    static int labelCounter = 0;
    // synchronized makes the method thread safe. At a time only one thread can access this method
    synchronized void changeCounter(){
        counter++;
    }
    static synchronized void labelCounter(){
        labelCounter++;
    }
}