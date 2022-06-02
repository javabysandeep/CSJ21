package collectionDemo.setDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // unique elements but no insertion no sorting order.
        Set set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(10);
        set.add(null);
        set.add(null);
        System.out.println(set);

    }
}
