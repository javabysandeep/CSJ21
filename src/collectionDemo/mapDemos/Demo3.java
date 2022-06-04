package collectionDemo.mapDemos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo3 {
    public static void main(String[] args) {
        // keys should be unique
        // no insertion order
        //no sorting order
        // values can be duplicated
        // key and values can be homogenous, heterogenous

        Map map = new TreeMap();
        map.put(1,"value string");
//        map.put("1",null);
//        map.put("null",null);
        map.put(9,98);
        map.put(11,98);
        map.put(10,98);
        map.put(10,980000);
        System.out.println(map);
    }
}
