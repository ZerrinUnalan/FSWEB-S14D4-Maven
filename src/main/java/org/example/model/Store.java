package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale bread = new Bread("kepekli", 10, "sofraların vazgeçilmezi", 400);
        ProductForSale chocolate = new Chocolate("bitter", 50, "mutlu eder", 10);
        ProductForSale coke = new Coke("original", 20, "soğuk içiniz", "kola");

        ProductForSale[] products = new ProductForSale[]{bread, chocolate, coke};
        //listProducts();

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i=0; i<products.length; i++){
            products[i].showDetails();
        }
    }
}