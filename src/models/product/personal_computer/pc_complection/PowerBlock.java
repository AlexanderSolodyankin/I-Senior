package models.product.personal_computer.pc_complection;

import service.Sels;

public class PowerBlock implements Sels {
    private String name;
    private int power;
    private double price;
    private int pin;
    private int countPin;

    public PowerBlock() {
    }

    public PowerBlock(String name, int power, double price, int pin, int countPin) {
        this.name = name;
        this.power = power;
        this.price = price;
        this.pin = pin;
        this.countPin = countPin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCountPin() {
        return countPin;
    }

    public void setCountPin(int countPin) {
        this.countPin = countPin;
    }

    @Override
    public String toString() {
        return "PowerBlock{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", price=" + price +
                ", pin=" + pin +
                ", countPin=" + countPin +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
