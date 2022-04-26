package oops.abstraction.defaultMethods;

public class Implementation implements I1, I2{
    @Override
    public void m1() {
//        System.out.println("m1 in impl");
        I1.super.m1();
    }

    public static void main(String[] args) {
        I1 i1 = new Implementation();
        i1.m1();

        I2 i2 = new Implementation();
        i2.m1();
    }
}
