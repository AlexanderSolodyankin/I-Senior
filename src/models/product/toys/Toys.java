package models.product.toys;

import service.Sels;

public class Toys implements Sels {
    private String name;
    private boolean gender;
    private double price;
    private String discript;

    public Toys(String name, boolean gender, double price, String discript) {
        this.name = name;
        this.gender = gender;
        this.price = price;
        this.discript = discript;
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

    public String getDiscript() {
        return discript;
    }

    public void setDiscript(String discript) {
        this.discript = discript;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", price=" + price +
                ", discript='" + discript + '\'' +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
