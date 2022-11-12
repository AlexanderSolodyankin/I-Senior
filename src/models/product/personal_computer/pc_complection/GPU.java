package models.product.personal_computer.pc_complection;

import service.Sels;

public class GPU  implements Sels {
    private String name;
    private String model;
    private int gRAM;
    private double price;

    public GPU(String name, String model, int gRAM, double price) {
        this.name = name;
        this.model = model;
        this.gRAM = gRAM;
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

    public int getgRAM() {
        return gRAM;
    }

    public void setgRAM(int gRAM) {
        this.gRAM = gRAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", gRAM=" + gRAM +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
