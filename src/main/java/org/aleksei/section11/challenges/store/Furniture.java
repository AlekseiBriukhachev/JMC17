package org.aleksei.section11.challenges.store;

public class Furniture extends ProductForSale {
    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufactured in North Carolina");
        System.out.printf("The price of piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
