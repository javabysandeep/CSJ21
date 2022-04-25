package oops.abstraction;

public class Child extends ParentAbstract{
    @Override
    void abstractMethod() {
        System.out.println("implemented");
    }
    void m1(){
        System.out.println("m1 child class method");
    }
}
