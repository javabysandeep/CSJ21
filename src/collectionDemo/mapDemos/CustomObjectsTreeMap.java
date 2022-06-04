package collectionDemo.mapDemos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomObjectsTreeMap {
    public static void main(String[] args) {
        Student s1 = new Student(10,"Ram");
        Student s6 = new Student(10,"Ram");
        Student s7 = new Student(10,"Ram");
        Student s8 = new Student(10,"Ram");
        Student s9 = new Student(10,"Ram");
        Student s2 = new Student(1,"Lakhan");
        Student s3 = new Student(11,"Sita");
        Student s4 = new Student(5,"Raavan");
        Student s5 = new Student(6,"Hanuman");

        Map<Student, Integer> record = new TreeMap<>();
        record.put(s1,78);
        record.put(s6,78);
        record.put(s7,78);
        record.put(s8,78);
        record.put(s9,78);
        record.put(s2,78);
        record.put(s3,78);
        record.put(s4,78);
        record.put(s5,78);

        System.out.println(record);
    }
}
