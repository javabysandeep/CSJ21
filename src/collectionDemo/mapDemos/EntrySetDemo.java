package collectionDemo.mapDemos;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EntrySetDemo {
    public static void main(String[] args) {
        Student s1 = new Student(10,"Ram");
        Student s2 = new Student(1,"Lakhan");
        Student s3 = new Student(11,"Sita");
        Student s4 = new Student(5,"Raavan");
        Student s5 = new Student(6,"Hanuman");

        Map<Student, Integer> record = new TreeMap<>();
        record.put(s1,78);
        record.put(s2,78);
        record.put(s3,78);
        record.put(s4,78);
        record.put(s5,78);

        Set<Student> keys = record.keySet();
        for (Student s:keys) {
            System.out.println(s);
        }
        Collection<Integer> values = record.values();

//        System.out.println(keys);
       // System.out.println(values);
        System.out.println("valeus******");
        for (Integer i:values) {
            System.out.println(i);
        }

        Set<Map.Entry<Student, Integer>> entries = record.entrySet();
        for (Map.Entry<Student,Integer> entry: entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}









