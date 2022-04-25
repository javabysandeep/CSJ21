package oops.abstraction;

public abstract class ParentAbstract {
    void concreteMethod() {
        System.out.println("It has implementation/body/curly braces");
    }

    abstract void abstractMethod();

    ParentAbstract() {
        System.out.println("Abstract class con");
    }

    public static void main(String[] args) {
        System.out.println("abstract main method");
    }
}
