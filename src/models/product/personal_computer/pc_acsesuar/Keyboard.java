package models.product.personal_computer.pc_acsesuar;

import service.Sels;

public class Keyboard  implements Sels {
    private String name;
    private int countKey;
    private double price;

    public Keyboard() {
    }

    public Keyboard(String name, int countKey, double price) {
        this.name = name;
        this.countKey = countKey;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountKey() {
        return countKey;
    }

    public void setCountKey(int countKey) {
        this.countKey = countKey;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "name='" + name + '\'' +
                ", countKey=" + countKey +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
