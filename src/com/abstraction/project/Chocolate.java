package com.abstraction.project;

public class Chocolate extends ProductForSale {
    private  String color;
    public Chocolate(String type , double price , String description,String color){
        super(type,price,description);
        if(color.equalsIgnoreCase("brown")){
            this.color = color;
        }
        else if(color.equalsIgnoreCase("white")){
            this.color = color;
        }
        else this.color = "black";
    }
    public String getColor(){
        return  color;
    }
    @Override
    public void showDetails() {
        System.out.println("Product for sale - chocolate : " +"{ " + "Type : "+ getType() +"," +
                " Price : "+ getPrice()+ "," +" Description : "+ getDescription() + ","+
                " Color: "+ getColor()+ " }");
    }
}
