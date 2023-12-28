package com.abstraction.project;

public class Bread extends  ProductForSale{

    private int count;

    public Bread(String type ,double price , String description , int count_bread){
        super(type,price,description);
        count = count_bread;
    }

    public int getCount(){
        return  count;
    }
    @Override
    public void showDetails() {
        System.out.println("Product for sale - Bread : " +"{ " + "Type : "+ getType() + "," +
                " Price : "+ getPrice()+ "," + " Description : "+ getDescription() + "," +
                " Bread - Count : "+ getCount()+ " }");
    }
}
