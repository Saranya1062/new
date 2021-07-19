package com.practice;

class ShoppingCart {
    private double price;
    private double extracharges;
    private double totalCost;

    public ShoppingCart() {
    }

    public ShoppingCart(double price, double extracharges) {
        this.price = price;
        this.extracharges = extracharges;
    }

    public double getTotalCost() {
        return totalCost;
    }

    void workMode(){
        System.out.println("Mode was either using electricity or battery");
    }

    public void printprice() {
        totalCost=price+extracharges;
        System.out.println("Total cost is: "+getTotalCost());
    }
}

class Fridge extends ShoppingCart
{
    @Override
    void workMode() {
        System.out.println("Mode was electricity");
    }

    public Fridge(double price, double extracharges) {
        super(price, extracharges);
    }
}

class Cooler extends ShoppingCart {
    @Override
    void workMode() {
        super.workMode();
    }

    public Cooler(double price, double extracharges) {
        super(price, extracharges);
    }
}

class Vaccum extends ShoppingCart {
    @Override
    void workMode() {
        System.out.println("Mode was battery");
    }

    public Vaccum(double price, double extracharges) {
        super(price, extracharges);
    }
}
