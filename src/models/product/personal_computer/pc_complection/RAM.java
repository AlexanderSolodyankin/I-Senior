package models.product.personal_computer.pc_complection;

import service.Sels;

public class RAM implements Sels {
    private String brand;
    private String model;
    private int purity;
    private int volume;
    private double price;


    public RAM() {
    }

    public RAM(String brand, String model, int purity, int volume, double price) {
        this.brand = brand;
        this.model = model;
        this.purity = purity;
        this.volume = volume;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPurity() {
        return purity;
    }

    public void setPurity(int purity) {
        this.purity = purity;
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
        return "\n RAM{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", purity=" + purity +
                ", volume=" + volume +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
