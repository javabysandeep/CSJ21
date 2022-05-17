package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int[] array  = {1,2,3};
        List<Object> list = new ArrayList<>();
        list.add(array);
        list.add(array);
        list.add(array);
        System.out.println(list.size());
        System.out.println(list.get(0));
        for (Object obj:list) {
            System.out.println();
        }
    }
}

interface I1{
    void m1();
    void m2();
    void m3();
    void m4();
}
class Adapter  implements  I1{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}
class Impl extends Adapter{
    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }
}