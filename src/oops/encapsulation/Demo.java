package oops.encapsulation;

public class Demo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieId(300);
        System.out.println(movie.getMovieId());

        movie.setMovieName("KGF");
        System.out.println(movie.getMovieName());
    }
}
