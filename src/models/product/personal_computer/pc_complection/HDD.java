package models.product.personal_computer.pc_complection;

import service.Sels;

public class HDD implements Sels {
    private String name;
    private int volume;
    private String model;
    private double price;

    public HDD(String name, int volume, String model, double price) {
        this.name = name;
        this.volume = volume;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
