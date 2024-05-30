package org.example.model;

public class Coke extends ProductForSale {
    private String drink;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, String drink) {
        super(type, price, description);
        this.drink = drink;
    }

        @Override
        public void showDetails() {
            System.out.println("Bu ürünün tipi: " + super.getType() + " fiyatı: " + super.getPrice() + " açıklaması: " + super.getDescription() + " türü: " + this.drink);

        }
    }