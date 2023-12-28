package com.abstraction.store;

import com.abstraction.project.Bread;
import com.abstraction.project.Chocolate;
import com.abstraction.project.Coke;
import com.abstraction.project.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];

        ProductForSale productChocalate = new Chocolate("food",25.99,"Aburcubur","brown");
        ProductForSale productChocalateTwo = new Chocolate("food",25.99,"Aburcubur","red");
        ProductForSale productCoke = new Coke("drink",34.4,"Enerji - Sınıfı",true);
        ProductForSale productBread = new Bread("food",7.5,"Temel - Gıda",3);
        products[0] = productChocalate;
        products[1] = productCoke;
        products[2] = productBread;
        products[3] = productChocalateTwo;

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        try {
            for (ProductForSale product : products) {
                product.showDetails();
            }
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}