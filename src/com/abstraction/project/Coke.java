package com.abstraction.project;

public class Coke extends ProductForSale{
    private  boolean isCold;

    public Coke(String type, double price, String description, boolean isCold) {
        super(type, price, description);
        this.isCold = isCold;
    }

    public boolean isCold() {
        return isCold;
    }

    @Override
    public void showDetails() {
        System.out.println("Product for sale - coke : " +"{ " + "Type : "+ getType() + ","+
                " Price : "+ getPrice()+ "," + " Description : "+ getDescription() + "," +
                " Status : "+ isCold+ " }");
    }
}
