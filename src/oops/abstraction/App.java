package oops.abstraction;

public class App {
    public static void main(String[] args) {
//    ParentAbstract parentAbstract = new ParentAbstract();
        Child child = new Child();
        ParentAbstract pc = new Child();
        pc.abstractMethod();
//        pc.m1();
    }
}
