package models.product.toys;

import service.Sels;

public class Toys implements Sels {
    private String name;
    private boolean gender;
    private double price;

    public Toys() {
    }

    public Toys(String name, boolean gender, double price) {
        this.name = name;
        this.gender = gender;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Toys{" +
                "name='" + name + '\'' +
                ", gender=" + (gender? " boy": " girl") +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
