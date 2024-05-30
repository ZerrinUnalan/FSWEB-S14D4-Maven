package org.example.model;

public class Chocolate extends ProductForSale {
    private double sugarPer;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }

    public Chocolate(String type, double price, String description, double sugarPer) {
        super(type, price, description);
        this.sugarPer = sugarPer;
    }

        @Override
        public void showDetails() {
            System.out.println("Bu ürünün tipi: " + super.getType() + " fiyatı: " + super.getPrice() + " açıklaması: " + super.getDescription() + " şeker oranı: %" + this.sugarPer);
        }
    }