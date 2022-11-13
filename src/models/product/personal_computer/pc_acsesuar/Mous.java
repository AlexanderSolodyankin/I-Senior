package models.product.personal_computer.pc_acsesuar;

import service.Sels;

public class Mous implements Sels {
    private String name;
    private double price;

    public Mous() {
    }

    public Mous(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
