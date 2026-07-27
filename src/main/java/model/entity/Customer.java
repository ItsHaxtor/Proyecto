package model.entity;

public class Customer {

    private String name;
    private String lastName;
    private int age;
    private int dni;
    private int numberPhone;

    public Customer(int age, int dni, String name, String lastName, int numberPhone) {
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.age = age;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getDni() {
        return dni;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public String toCSV() {
        return age + "," + dni + "," + name + "," + lastName + "," + numberPhone;
    }

}
