package models.product.personal_computer.pc_complection;

import service.Sels;

public class CPU  implements Sels {
    private String brand;
    private String model;
    private  double purity;
    private int kesh;
    private double price;

    public CPU() {
    }

    public CPU(String brand, String model, double purity, int kesh, double price) {
        this.brand = brand;
        this.model = model;
        this.purity = purity;
        this.kesh = kesh;
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

    public double getPurity() {
        return purity;
    }

    public void setPurity(double purity) {
        this.purity = purity;
    }

    public int getKesh() {
        return kesh;
    }

    public void setKesh(int kesh) {
        this.kesh = kesh;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n CPU{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", purity=" + purity +
                ", kesh=" + kesh +
                ", price=" + price +
                '}' +"\n";
    }

    @Override
    public void sels() {

    }
}
