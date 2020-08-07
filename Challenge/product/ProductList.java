package product;

import java.util.ArrayList;
import java.util.List;

public class ProductList{
    private List<Product> products;

    public ProductList(){
        products = new ArrayList<>();
    };

    public void addProductToList(Product product){
        products.add(product);
    }

    public void printTicket(){
        this.printList();
        System.out.println("===================================");
        this.printExpensiveAndCheap();
    }




    private void printList(){
        for(Product p : products){
            System.out.println(p);
        }
    }

    private void printExpensiveAndCheap(){
        System.out.println("Producto más caro: " + this.mostExpensive().getName());
        System.out.println("Producto más barato: " + this.mostCheap().getName());
    }

    private Product mostExpensive(){
        Product productMostExpensive = products.get(0);

        for(int i = 0; i < products.size()-1; i++){

            int j = i + 1;

         if(productMostExpensive.compareTo(products.get(j))<0){
                productMostExpensive = products.get(j);
            }
        }

        return productMostExpensive;
    }


    private Product mostCheap(){
        Product productCheap = products.get(0);

        for(int i = 0; i < products.size()-1; i++){

            int j = i + 1;

            if(productCheap.compareTo(products.get(j))>0){
                productCheap = products.get(j);
            }
        }

        return productCheap;
    }


}
