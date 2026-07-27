package model.entity;

public class Candys {

    private String name;
    private int price;
    private int amount;
    private String id;

    public Candys(String name, int price, int amount, String id) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    
    public String toStringDao() {
        return name + "," + price + "," + amount + "," + id;
    }

}
