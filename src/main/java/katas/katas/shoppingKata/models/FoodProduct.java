package katas.katas.shoppingKata.models;

public class FoodProduct extends Product {

    public FoodProduct(String name, double price) {
        super(name, price);
    }

    public void applyDiscount(double discount) {
        this.price = price - ((price/100)*discount);
    }


}
