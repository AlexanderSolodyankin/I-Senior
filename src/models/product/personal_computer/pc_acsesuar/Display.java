package models.product.personal_computer.pc_acsesuar;

import service.Sels;

public class Display implements Sels {
    private String name;
    private String model;
    private int width;
    private int heith;
    private double price;

    public Display(String name, String model, int width, int heith, double price) {
        this.name = name;
        this.model = model;
        this.width = width;
        this.heith = heith;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeith() {
        return heith;
    }

    public void setHeith(int heith) {
        this.heith = heith;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Display{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", width=" + width +
                ", heith=" + heith +
                ", price=" + price +
                '}'+ "\n";
    }

    @Override
    public void sels() {

    }
}
