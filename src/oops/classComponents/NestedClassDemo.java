package oops.classComponents;

public class NestedClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.outerVar);

        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.innerVar);

        Outer.StaticNested staticNested = new Outer.StaticNested();
        System.out.println(staticNested.innerVar);
        System.out.println(Outer.StaticNested.staticVar);

    }
}
