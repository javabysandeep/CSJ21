package oops.abstraction;

public interface I2 {
    int number = 200;

    void m1();

    default void print() {
        System.out.println("printing I2");
    }
}
