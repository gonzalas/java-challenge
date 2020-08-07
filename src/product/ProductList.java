package product;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println(this.mostCheap());
        System.out.println(this.mostExpensive());
    }

    private String mostExpensive(){
        String response = "";

        Collections.sort(products, Collections.reverseOrder());
        response = "Producto más caro: " + products.get(0).getName();

        return response;
    }


    private String mostCheap(){
        String response = "";

        Collections.sort(products);
        response = "Producto más barato: " + products.get(0).getName();

        return response;
    }


}
