package collectionDemo.listDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String>  stringList = new ArrayList<>();
        stringList.add("Sumit");
        stringList.add("Shivsamarth");
        stringList.add("Bhavesh");
        stringList.add("Satyam");
        stringList.add("Rasika");
        stringList.add("Mangesh");
        stringList.add("Manjusha");
        stringList.add("Shlok");
        stringList.add("Rohit");
        stringList.add("Sandeep");

        Collections.sort(stringList);
        for (String str:stringList) {
            System.out.println(str);
        }
    }
}
