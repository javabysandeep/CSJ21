package oops.inheritance.p2;

import oops.inheritance.p1.A;

public class B extends A {
    void display(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        A a = new A();
        //System.out.println(a.a);
       // a.m1();

        B b = new B();
        System.out.println(b.a);
        b.m1();

        A ab = new B();
       // ab.a;
       // ab.m1();
    }
}
