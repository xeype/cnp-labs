package com.xeype.entity;

public class Cheese extends BaseProduct {

    private String type;

    public Cheese() {
    }

    public Cheese(double price, String productName, String type) {
        super(price, productName);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + type;
    }
}
