package model.entity;

public class SaleDetail {

    private Movie movie;
    private int amountOfTickets;
    private double subtotal;
    private CinemaSeats seats;

    //constructor
    public SaleDetail(Movie movie, CinemaSeats seats, int amount) {
        this.movie = movie;
        this.amountOfTickets = amount;
        this.seats = seats;
        //subtotal
        this.subtotal = amount * (movie.getPrice() * seats.getSeatPrice());
    }
 // calcular total
    public SaleDetail(int amount) {
        this.subtotal = amount * (movie.getPrice() * seats.getSeatPrice());
    }

    //Getters y Setters
    public Movie getMovie() {
        return movie;
    }

    public int getAmountOfTickets() {
        return amountOfTickets;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public CinemaSeats getSeats() {
        return seats;
    }

}
