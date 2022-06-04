package collectionDemo.mapDemos;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EntrySetDem02 {
    public static void main(String[] args) {
        Student s1 = new Student(10,"Ram");
        Student s2 = new Student(1,"Lakhan");
        Student s3 = new Student(11,"Sita");
        Student s4 = new Student(5,"Raavan");
        Student s5 = new Student(6,"Hanuman");

        Map<Student, Integer> map = new TreeMap<>();
        map.put(s1,78);
        map.put(s2,78);
        map.put(s3,78);
        map.put(s4,78);
        map.put(s5,78);

        Collection<Integer> values = map.values();
        System.out.println(values);

        Set<Student> keys = map.keySet();
        System.out.println(keys);


    }
}









