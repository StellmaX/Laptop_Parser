package org.example.seminar.src.org.example.laptop;

// создаем обьект Laptop
public class Laptop {
    private String model;
    private int ram; 
    private int storage;
    private String os;
    private String colour;

    public Laptop(String model, int ram, int storage, String os, String colour) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.colour = colour;
    }


    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public String getOs() {
        return os;
    }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Ноутбук {" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}