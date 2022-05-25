package multithreading;

public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data();
        Thread thread = new Thread(() -> {
            data.send();

        }, "thread1");
        thread.start();
        Thread thread2 = new Thread(() -> {
            data.receive();

        }, "thread2");
        thread2.start();
    }
}

class Data {
    synchronized void send() {
        try {
            System.out.println("thread1 has sent the data and waiting for the acknowledgement");
            wait();//thread1 is in waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

    synchronized void receive() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I have received the data");
        notify();
        System.out.println("Notified waiting state thread");
    }
}