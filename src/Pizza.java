public class Pizza {

    private boolean pizzabase;
    private int totalPrice = 0;
    private final int vegBasePrice = 10;
    private final int nonVegBasePrice = 12;
    private final int extraCheesePrice = 1;
    private final int extraToppingsPrice = 2;
    private final int takeAwayBagPrice = 1;
    private String bill = "";

    public Pizza(boolean pizzabase) {
        this.pizzabase = pizzabase;
        if (this.pizzabase){
            this.totalPrice += this.vegBasePrice;
            this.bill = this.bill+"Pizza base: $"+this.vegBasePrice+"\n";
        }else {
            this.totalPrice += this.nonVegBasePrice;
            this.bill = this.bill+"Pizza base: $"+this.nonVegBasePrice+"\n";
        }
    }

    public void addExtraCheese(){
        this.totalPrice += this.extraCheesePrice;
        this.bill += "Ext Cheese: $"+this.extraCheesePrice+"\n";
    }

    public void addExtraToppings(){
        this.totalPrice += this.extraToppingsPrice;
        this.bill += "Ext Toppings: $"+this.extraToppingsPrice+"\n";
    }

    public void takeAway(){
        this.totalPrice += this.takeAwayBagPrice;
        this.bill += "Take Away: $"+this.takeAwayBagPrice+"\n";
    }

    public void getBill() {
        System.out.println(bill);
        System.out.println(("Total : $" + this.totalPrice));
    }
}
