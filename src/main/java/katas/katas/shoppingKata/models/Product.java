package katas.katas.shoppingKata.models;

public class Product {
    protected String name;
    protected double price;


    protected Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }



    public double getPrice() {
       return price;
    }


}
