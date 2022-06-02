package collectionDemo.listDemos;

public class A {
    private class B implements I1 {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

    public I1 i1() {
        return new B();
    }
}
class App{
    public static void main(String[] args) {
        A a = new A();
        I1 i1 = a.i1();
        i1.hasNext();
        i1.next();
    }
}