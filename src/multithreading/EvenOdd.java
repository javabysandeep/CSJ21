package multithreading;

public class EvenOdd {
    public static void main(String[] args) throws InterruptedException {

        Thread even = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }, "even");
        even.setName("even");

        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }, "odd");

        even.start();
        odd.start();

    }
}
