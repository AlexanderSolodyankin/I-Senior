package models.product.phone;

import service.Sels;

public class SDCard implements Sels {
    private String name;
    private int volum;
    private double price;

    public SDCard() {
    }

    public SDCard(String name, int volum, double price) {
        this.name = name;
        this.volum = volum;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "SDCard{" +
                "name='" + name + '\'' +
                ", volum=" + volum +
                ", price=" + price +
                '}'+"\n";
    }

    @Override
    public void sels() {

    }
}
