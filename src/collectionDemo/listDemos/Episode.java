package collectionDemo.listDemos;

class Episode /*implements Comparable<Episode>*/ {
    int episodeNumber;
    String episodeTitle;

    @Override
    public String toString() {
        return "Episode{" +
                "episodeNumber=" + episodeNumber +
                ", episodeTitle='" + episodeTitle + '\'' +
                '}';
    }

    public Episode(int episodeNumber, String episodeTitle) {
        this.episodeNumber = episodeNumber;
        this.episodeTitle = episodeTitle;
    }

    /*@Override
    public int compareTo(Episode episode) {
//        return this.episodeNumber - episode.episodeNumber;
        return this.episodeTitle.compareTo(episode.episodeTitle);
    }*/
}