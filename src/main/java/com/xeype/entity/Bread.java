package com.xeype.entity;

public class Bread extends BaseProduct {

    private String brand;

    public Bread() {
    }

    public Bread(double price, String productName, String brand) {
        super(price, productName);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBrand: " + brand;
    }
}
