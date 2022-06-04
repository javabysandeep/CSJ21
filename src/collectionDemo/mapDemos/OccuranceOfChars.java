package collectionDemo.mapDemos;

import java.util.HashMap;

public class OccuranceOfChars {
    public static void main(String[] args) {
        String str = "cyber success";
        char[] chars = str.trim().replace(" ", "").toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character ch:chars) {
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            } else{
                hashMap.put(ch,1);
            }
        }
        System.out.println(hashMap);
    }
}
