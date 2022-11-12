package models.product.dres;

import service.Sels;

public class Boots implements Sels {
    private String name;
    private boolean gender;
    private int volume;
    private double price;

    public Boots(String name, boolean gender, int volume, double price) {
        this.name = name;
        this.gender = gender;
        this.volume = volume;
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Boots{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", volume=" + volume +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
