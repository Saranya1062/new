package com.practice;

public class Main {

    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();

        s=new Fridge(15000,1000);
        s.printprice();

        s=new Cooler(30000,2000);
        s.printprice();

        s=new Vaccum(12000,1000);
        s.printprice();
    }
}
