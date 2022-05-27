package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(0, 30);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(10));
        System.out.println("After removal "+arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(20));

        System.out.println("reading data one by one");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("For each way to read data");
        for (Object obj:arrayList) {
            System.out.println(obj);
        }

        System.out.println("using java 8 foreach");
        arrayList.forEach(System.out::println);

        //Iterator way.
    }
}
