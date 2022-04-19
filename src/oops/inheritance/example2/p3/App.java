package oops.inheritance.example2.p3;

import oops.inheritance.example2.p1.A;
import oops.inheritance.example2.p2.B;

public class App {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.iv1);
        // cant access
        /*System.out.println(a.iv2);
        System.out.println(a.iv3);
        System.out.println(a.iv4);*/
        B b = new B();
        System.out.println(b.iv1);

        // cant access
        /* System.out.println(b.iv2);
        System.out.println(b.iv3);
        System.out.println(b.iv4);*/
    }
}
