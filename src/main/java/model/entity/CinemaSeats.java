package model.entity;

public class CinemaSeats {

    private String type;
    private double seatPrice;
    private int ticketNumber;
    private int numberOfTickets;

    public CinemaSeats(int ticketNumber, String type, double seatPrice, int numberOfTickets) {
        this.seatPrice = seatPrice;
        this.type = type;
        this.ticketNumber = ticketNumber;
        this.numberOfTickets = numberOfTickets;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public String getType() {
        return type;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public String toCSV() {
        return ticketNumber + "," + type + "," + seatPrice + "," + numberOfTickets;
    }
}
