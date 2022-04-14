package katas.katas.shoppingKata;

import katas.katas.shoppingKata.models.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class shoppingTest {
    @Test
    void priceOfFreeProductsIsAlwaysZero() {

        FreeProduct freeProduct = new FreeProduct("perejil", 0.0);
        assertThat(freeProduct.getPrice(), equalTo(0.0) );
    }
    @Test
    void allProductsHaveNameAndPrice() {

        Product product = new Product("potatoes",3.60);
        assertThat(product, hasProperty("name") );
        assertThat(product, hasProperty("price") );
    }

    @Test
    void foodProductsCanHaveNameADiscount() {

        FoodProduct foodProduct = new FoodProduct("potatoes",10.0);
        foodProduct.applyDiscount(10);
        assertThat(foodProduct.getPrice(), equalTo(9.0) );
    }

    @Test
    void foodProductPriceWithoutDiscountIsTheOriginalPrice() {

        FoodProduct foodProduct = new FoodProduct("potatoes",10.0);
        assertThat(foodProduct.getPrice(), equalTo(10.0));
    }

    @Test
    void foodProductPriceWithDiscountIsTheOriginalPriceMinusDiscount() {

        FoodProduct foodProduct = new FoodProduct("potatoes",50.0);
        foodProduct.applyDiscount(10);
        assertThat(foodProduct.getPrice(), equalTo(45.0));
    }

    @Test
    void cartHaveANumberOfProductsThatCanBeZero() {

        Cart cart = new Cart();

        int result = cart.productsNumber();
        assertThat(result, equalTo(0));
    }

    @Test
    void cartHaveANumberOfProductsThatCanBeMoreThanZero() {

        Cart cart = new Cart();
        ArrayList<Product> cartList = new ArrayList<>();
        Product product = new Product("product", 10);
        cartList.add(product);
        cart.cartList = cartList;


        int result = cart.productsNumber();
        assertThat(result, equalTo(1));
    }

    @Test
    void totalCostOfCartProductsIsTheSumOfProductsPricesAndTheirDiscounts() {

        Cart cart = new Cart();

        //creamos Lista de productos
        ArrayList<Product> cartList = new ArrayList<>();
        //creamoos productos
        FoodProduct potatoes = new FoodProduct("potatoes",10);
        Product tomatoes = new Product("tomatoes",10);
        Product cheese = new Product("cheese",10);

        //Añadimos un descuento
        potatoes.applyDiscount(50);

        //Añadioms los productos a la lista de productos
        cartList.add(potatoes);
        cartList.add(tomatoes);
        cartList.add(cheese);
        //Igualamos la lista del Carrito a la lista de productos creada
        cart.cartList = cartList;

        double result = cart.getTotalCost();
        assertThat( result, equalTo(25.00));
    }

    @Test
    void bookProductsHaveAuthorAndDescriptionInAdditionToNameAndPrice(){
        BookProduct book = new BookProduct("TheBook", 10,"The Author", "The Description");

        assertThat(book, hasProperty("name") );
        assertThat(book, hasProperty("price") );
        assertThat(book, hasProperty("author") );
        assertThat(book, hasProperty("description") );
    }

    @Test
    void bookProductCanHaveADiscountButNeverGreaterThanTenPerCent(){
        BookProduct book = new BookProduct("TheBook", 10,"The Author", "The Description");

        book.applyDiscount(11);

        assertThat(book.getPrice(), equalTo(9.0));

    }
}
