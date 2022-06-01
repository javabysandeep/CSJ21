package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        Episode episode1 = new Episode(12,"Core Java");
        Episode episode2 = new Episode(2,"Servlet");
        Episode episode3 = new Episode(1,"Jsp");
        Episode episode4 = new Episode(3,"JDBC");
        Episode episode5 = new Episode(6,"Spring");

        List<Episode> episodeList = new ArrayList<>();
        episodeList.add(episode1);
        episodeList.add(episode2);
        episodeList.add(episode3);
        episodeList.add(episode4);
        episodeList.add(episode5);

       // Comparator<Episode> episodeComparator = (e1,e2)->e1.episodeNumber-e2.episodeNumber;

        episodeList.forEach(System.out::println);
        System.out.println("After sorting");
        Collections.sort(episodeList, (e1,e2)->e1.episodeTitle.compareTo(e2.episodeTitle));
        episodeList.forEach(System.out::println);
    }
}


