package katas.katas.shoppingKata.models;

public class FreeProduct extends Product {


    public FreeProduct( String name, double price) {
        super(name, price);

    }

    public double getPrice() {
        return price =0.0;
    }
}
