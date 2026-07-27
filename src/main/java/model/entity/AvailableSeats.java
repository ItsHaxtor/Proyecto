package model.entity;

public class AvailableSeats {

    private String room;
    private int availableSeats;

    public AvailableSeats(int availableSeats, String room) {
        this.availableSeats = availableSeats;
        this.room = room;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public String getRoom() {
        return room;
    }
    

}
