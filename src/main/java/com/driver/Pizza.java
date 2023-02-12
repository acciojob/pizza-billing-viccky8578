package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
     boolean isAddExtraCheese;

     boolean isAddTakeaway;
    boolean isAddTopping;
    boolean isBillCreated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price=300;
            this.toppings=70;
        }
        else {
            this.price=400;
            this.toppings=120;
        }
         this.isAddExtraCheese=false;
        this.isAddTakeaway=false;
        this.isAddTopping=false;
        this.isBillCreated=false;
        this.bill="Base Price Of The Pizza:" + this.price +"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isAddExtraCheese)
        {
            this.price+=80;
           this.isAddExtraCheese=true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        if(!isAddTopping)
        {
            this.price+=this.toppings;
            isAddTopping=true;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!isAddTakeaway)
        {
            this.price+=20;
            isAddTakeaway=true;
        }


    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if (isAddExtraCheese) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isAddTopping) {
                this.bill += "Extra Toppings Added" +this.toppings + "\n";
            }
            if (isAddTakeaway) {
                this.bill +="Paperbag Added:20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            this.isBillCreated=true;
            return this.bill;

        }
        return "";
    }
}
