package oops.abstraction;

public class I1I2Impl implements I1, I2{
    @Override
    public void m1() {
        System.out.println("m1 implemented");
    }

    @Override
    public void print() {
        //1. write custom impl
        System.out.println("child class");
        //2. call I1 parent method
        I1.super.print();
        //3. call I2 parent method
        I2.super.print();
    }

    public static void main(String[] args) {
        I1 i1 = new I1I2Impl();
        I2 i2 = new I1I2Impl();
        i1.print();
        i2.print();
    }
}
