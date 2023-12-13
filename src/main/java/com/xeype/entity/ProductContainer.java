package com.xeype.entity;

import java.util.Arrays;
import java.util.Comparator;

public class ProductContainer {
    private static final int INITIAL_CAPACITY = 10;
    private BaseProduct[] products;
    private int size;

    public ProductContainer() {
        products = new BaseProduct[INITIAL_CAPACITY];
        size = 0;
    }

    public void addProduct(BaseProduct product) {
        if (size == products.length) {
            products = Arrays.copyOf(products, 2 * size);
        }

        products[size] = product;
        size++;
    }

    public int countProducts() {
        return size;
    }

    public BaseProduct getProduct(int index) {
        if (index >= 0 && index < size) {
            return products[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void sortProductsByPrice() {
        Arrays.sort(products, 0, size, Comparator.comparingDouble(BaseProduct::getPrice));
    }

    public void printContents() {
        System.out.println("Product Container Contents: ");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
            System.out.println();
        }
    }
}
