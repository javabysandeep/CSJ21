package oops.access;

import oops.access.p1.A;
import oops.access.p2.B;

public class Specifiers {
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.a);
        System.out.println(a.b);
//        System.out.println(a.c);
//        System.out.println(a.d);
        B b = new B();
    }
}
