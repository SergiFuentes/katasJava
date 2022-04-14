package katas.katas.shoppingKata.models;

import java.util.ArrayList;

public class Cart {

    public double totalCost;
    public ArrayList<Product> cartList;

    public int productsNumber() {
        if(cartList == null){return 0;}
        return cartList.size();
    }

    public double getTotalCost() {
        for(int i = 0; i< cartList.size(); i++ ) {
           totalCost += cartList.get(i).price;
        } return totalCost;
    }

}
