package org.example;

public class Notebook {
    private String brand;
    private int price;
    private String colour;
    private int ram;

    public Notebook(String brand, int price, String colour, int ram) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
