package com.xeype;

import com.xeype.entity.BaseProduct;
import com.xeype.entity.Bread;
import com.xeype.entity.Cheese;
import com.xeype.entity.ProductContainer;

public class Main {
    public static void main(String[] args) {
        ProductContainer container = new ProductContainer();

        container.addProduct(new Cheese(5.99, "Cheddar", "Hard"));
        container.addProduct(new Bread(2.49, "Wheat", "Wheat Bakery"));
        container.addProduct(new Cheese(3.99, "Parmesan", "Light"));
        container.addProduct(new Bread(1.99, "Dark", "Dark Bakery"));

        System.out.println("Before sorting: ");
        container.printContents();

        System.out.println("Number of products: " + container.countProducts());

        System.out.println("Product at index 0: " + container.getProduct(0));

        System.out.println("After sorting: ");
        container.sortProductsByPrice();
        container.printContents();
    }
}