package oops.encapsulation;

public class Movie {
    private int movieId ;
    private String movieName;
    private int ticketPrice;

    public Movie() {
    }

    public Movie(int movieId) {
        this.movieId = movieId;
    }

    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public Movie(int movieId, String movieName, int ticketPrice) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
