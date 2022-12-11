package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice = 0;
    private int total = 0;
    private int toppingPrice = 0;
    private int takeAwayPrice = 0;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg == true) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        cheesePrice += 80;
    }

    public void addExtraToppings() {
        // your code goes here
        if (isVeg == true) {
            toppingPrice += 70;
        } else {
            toppingPrice += 120;
        }
    }

    public void addTakeaway() {
        // your code goes here
        takeAwayPrice += 20;
    }

    public String getBill() {
        // your code goes here
        if (isVeg == true) {
            this.bill = "Base Price Of The Pizza: 300" + "\n";
            total += 300;
        } else {
            this.bill = "Base Price Of The Pizza: 400" + "\n";
            total += 400;
        }
        if (cheesePrice >= 80) {
            this.bill += "Extra Cheese Added: 80" + "\n";
            total += 80;
        }

        if (isVeg == true && toppingPrice >= 70) {
            this.bill += "Extra Toppings Added: 70" + "\n";
            total += 70;
        } else if (isVeg == false && toppingPrice >= 120) {
            this.bill += "Extra Toppings Added: 120" + "\n";
            total += 120;
        }

        if (takeAwayPrice >= 20) {
            this.bill += "Paperbag Added: 20" + "\n";
            total += 20;
        }

        this.bill += "Total Price: " + total + "\n";
        return this.bill;
        // Rommel
    }
}
