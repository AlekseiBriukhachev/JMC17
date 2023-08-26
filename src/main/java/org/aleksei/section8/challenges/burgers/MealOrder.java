package org.aleksei.section8.challenges.burgers;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;
    private String extra3;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 8.5);
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    public double getTotalPrice() {
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }
    public void printItemizedList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }
    public void addToppings(String extra1, String extra2, String extra3) {
        burger.addTopping(extra1, extra2, extra3);
    }
    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addTopping(extra1, extra2, extra3, extra4, extra5);
        }else {
            burger.addTopping(extra1, extra2, extra3);
        }
    }
    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
