package models.product.dres;

import service.Sels;

public class Dress implements Sels {
    private String name;
    private boolean gender;
    private int volum;
    private double price;

    public Dress(String name, boolean gender, int volum, double price) {
        this.name = name;
        this.gender = gender;
        this.volum = volum;
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

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Dress{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", volum=" + volum +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
