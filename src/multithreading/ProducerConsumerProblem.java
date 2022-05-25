package multithreading;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Product product = new Product();
        Thread producer = new Thread(()-> product.produce(),"producer");
        Thread consumer = new Thread(()-> product.consume(),"consumer");
        producer.setDaemon(false);
        producer.start();
        consumer.start();
    }
}

class Product {
    synchronized void produce()  {
        System.out.println(Thread.currentThread().getName() + " produced goods");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has consumed the goods");
        notify();
        System.out.println(Thread.currentThread().getName() + " notified waiting thread");
    }
}
