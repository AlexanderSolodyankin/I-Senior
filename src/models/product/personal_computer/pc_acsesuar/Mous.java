package models.product.personal_computer.pc_acsesuar;

import service.Sels;

public class Mous implements Sels {
    private String name;
    private String model;
    private double price;

    public Mous(String name, String model, double price) {
        this.name = name;
        this.model = model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mous{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
