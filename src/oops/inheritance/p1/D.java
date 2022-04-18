package oops.inheritance.p1;

public class D extends A{
    void display(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        a.m1();

        D d = new D();
        System.out.println(d.a);
        d.m1();

        A ad = new D();
        System.out.println(ad.a);
        ad.m1();
    }
}
