package collectionDemo.setDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // unique elements and insertion order but no sorting order.
        // heterogeneous data
        Set set = new LinkedHashSet();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add("Abc");
        set.add(null);
        set.add(null);
        set.add(true);
        set.add(10.f);
        set.add(null);
        System.out.println(set);

    }
}
