package collectionDemo.setDemos;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        // unique elements and sorting order.
        // Data will be sorted but for that elements should be of same type.
        // slower why? because sorting needs to happen
        Set set = new TreeSet();
        set.add(78);
        set.add(20);
        set.add(101);
        set.add(10);
        set.add(102);
        set.add(19);
        set.add(111);
        System.out.println(set);

    }
}
