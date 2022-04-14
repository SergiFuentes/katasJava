package katas.katas.shoppingKata.models;

public class BookProduct extends Product{
    public String author;
    public String description;

    public BookProduct(String name, double price, String author, String description) {
        super(name, price);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double applyDiscount(double discount) {
        if(discount >10){
          return  this.price = price - ((price/100)*10);
        }
       return this.price = price - ((price/100)*discount);
    }
}
