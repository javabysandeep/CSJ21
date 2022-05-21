package multithreading;

public class LambdaWay {
    public static void main(String[] args) {

        Thread thread =
                new Thread(() -> System.out.println("Lambda " + Thread.currentThread().getName()), "lambda");
        thread.start();
    }
}
