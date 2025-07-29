package com.nittan.advanceJava.AbstractAndAnonymous.EnumClass;


enum Laptop{
    ACER(100),ASUS(200),MACBOOK(500),HP(300),Dell;
    // if we not specify the price for one it looks for constructor, so we have to create a no parameterized constructor

    Laptop(){
        price = 400;
        // this price should be set to the laptop whose price is not mentioned
    }
    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Main {
    public static void main(String[] args) {

        for(Laptop laptop: Laptop.values()){
            System.out.println(laptop + " " + laptop.getPrice());
        }
    }
}
