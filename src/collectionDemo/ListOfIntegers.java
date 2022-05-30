package collectionDemo;

import java.util.*;
import java.util.ArrayList;

public class ListOfIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        integerList.add(110);
        integerList.add(100);
        integerList.add(11);
        integerList.add(34);

        Collections.sort(integerList);
        System.out.println(integerList);
    }
}
