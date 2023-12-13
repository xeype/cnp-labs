package com.xeype.entity;

abstract public class BaseProduct {
    private double price;
    private String productName;


    private static double totalProductPrice = 0;
    private static int numberOfProducts = 0;

    public BaseProduct() {
    }

    public BaseProduct(double price, String productName) {
        this.price = price;
        this.productName = productName;

        totalProductPrice += price;
        numberOfProducts++;
    }


    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setProductName(String productName) {
        this.productName = productName;
    }

    public static void printAveragePrice() {
        if (numberOfProducts > 0) {
            double averagePrice = totalProductPrice / numberOfProducts;
            System.out.println("Average price of products: $" + averagePrice);
        } else {
            System.out.println("No products available.");
        }
    }

    @Override
    public String toString() {
        return "Product Information:\n" +
                "Product Name: " + productName + "\n" +
                "Price: $" + price;
    }
}
