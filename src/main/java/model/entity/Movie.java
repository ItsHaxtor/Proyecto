package model.entity;

public class Movie {

    private String name;
    private double price;

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + price + "] " + name;
    }

    //método específico para el DAO
    public String toCSV() {
        return price + "," + name;
    }
   
}
