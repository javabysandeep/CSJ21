package collectionDemo.mapDemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        // keys should be unique
        // no insertion order
        //no sorting order
        // values can be duplicated
        // key and values can be homogenous, heterogenous

        Map map = new LinkedHashMap();
        map.put(1,"value string");
        map.put(null,null);
        map.put("1",null);
        map.put(null,null);
        map.put(10,98);
        System.out.println(map);
    }
}
