package collectionDemo.mapDemos;

import java.util.HashMap;

public class OccuranceOfWords {
    public static void main(String[] args) {
        String str = "cyber cyber success success";
        String[] strings = str.split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word:strings) {
            if(hashMap.containsKey(word)){
                hashMap.put(word, hashMap.get(word)+1);
            } else{
                hashMap.put(word,1);
            }
        }
        System.out.println(hashMap);
    }
}
