package oops.abstraction;

public interface I1 {
    int number = 100;
    void m1();

    class NestedClass{
        int nestedNumber = 300;
    }
    default void print(){
        System.out.println("printing I1");
    }
}
