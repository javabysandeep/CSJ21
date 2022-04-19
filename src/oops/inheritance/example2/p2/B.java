package oops.inheritance.example2.p2;

import oops.inheritance.example2.p1.A;

public class B extends A {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.iv1);
        //System.out.println(a.iv2);//private
        //System.out.println(a.iv3);// diff pkg and no relationship
        //System.out.println(a.iv4);//default

        B b = new B();
        System.out.println(b.iv1);
        //System.out.println(b.iv2);//private
        System.out.println(b.iv3);
        //System.out.println(b.iv4);//default
    }
}
