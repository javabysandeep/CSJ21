package oops.abstraction;

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        I1 i1 = new I1I2Impl();
        I2 i2 = new I1I2Impl();
        i1.m1();
        i2.m1();
        System.out.println(I1.number);
        System.out.println(I2.number);

        I1.NestedClass nestedClass = new I1.NestedClass();
        System.out.println(nestedClass.nestedNumber);
    }
}
