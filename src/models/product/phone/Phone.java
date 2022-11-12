package models.product.phone;

import service.Sels;

public class Phone implements Sels {
    private String name;
    private String model;
    private String color;
    private double price;


    public Phone() {
    }

    public Phone(String name, String model, String color, double price) {
        this.name = name;
        this.model = model;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
