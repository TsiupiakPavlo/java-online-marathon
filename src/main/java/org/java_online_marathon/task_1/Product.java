package org.java_online_marathon.task_1;

public class Product {
    private String name;
    private double price;
    public static int numberofobjects=0;

    public Product() {
        numberofobjects++;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        numberofobjects++;
    }

    public static int count() {
        return Product.numberofobjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
