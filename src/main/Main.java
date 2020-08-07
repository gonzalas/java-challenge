package main;

import product.ProductFruit;
import product.ProductList;
import product.ProductShampoo;
import product.ProductSoda;

public class Main {
        public static void main(String[]args){

                //Generating product list instance
                ProductList productList = new ProductList();

                //Creating objects
                ProductSoda cocaZero = new ProductSoda("Coca-Cola Zero", 20, 1.5f);
                ProductSoda coca = new ProductSoda("Coca-Cola", 18, 1.5f);
                ProductShampoo sedal = new ProductShampoo("Shampoo Sedal", 19, 500);
                ProductFruit frutilla = new ProductFruit("Frutillas", 64, "kilo");

                //Adding products to list
                productList.addProductToList(cocaZero);
                productList.addProductToList(coca);
                productList.addProductToList(sedal);
                productList.addProductToList(frutilla);

                //Print tickets on console
                productList.printTicket();

        }
}
