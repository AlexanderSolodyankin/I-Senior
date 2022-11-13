package models.product.personal_computer.pc_complection;

import service.Sels;

public class MotherBoard implements Sels {
    private String name;
    private String model;
    private int port;
    private double price;

    private CPU cpu;
    private RAM ram;
    private GPU videoCard;

    public MotherBoard() {
    }

    public MotherBoard(String name, String model, int port, double price) {
        this.name = name;
        this.model = model;
        this.port = port;
        this.price = price;
    }

    public MotherBoard(String name, String model, int port, double price, CPU cpu, RAM ram) {
        this.name = name;
        this.model = model;
        this.port = port;
        this.price = price;
        this.cpu = cpu;
        this.ram = ram;
    }

    public MotherBoard(String name, String model, int port, double price, CPU cpu, RAM ram, GPU videoCard) {
        this.name = name;
        this.model = model;
        this.port = port;
        this.price = price;
        this.cpu = cpu;
        this.ram = ram;
        this.videoCard = videoCard;
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

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public GPU getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(GPU videoCard) {
        this.videoCard = videoCard;
    }


    @Override
    public void sels() {

    }
}
