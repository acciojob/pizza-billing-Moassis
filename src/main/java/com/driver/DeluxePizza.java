package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if (isVeg == true) {
            this.cheesePrice = 0;
            this.toppingPrice = 0;
        } else {
            this.cheesePrice = 0;
            this.toppingPrice = 0;
        }
    }
}
