package java8;

//@FunctionalInterface
//Functional Interface : SAM[Single Abstract method]
public interface I1 {
    //void m1();
    int add(int num1, int  num2);
//    void m5();
    // void m2();
    default void m3(){}
    static void m4(){}
}
