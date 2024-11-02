import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pizza pizza;
        System.out.println(("Welcome to Pizza Store! \n Do you want to have 1.Regular Pizza or 2.Deluxe Pizza ?"));

        Scanner sc = new Scanner(System.in);
        int pizzaChoice = sc.nextInt();

        System.out.println("1.Veg \n 2.Non Veg");
        int pizzaType = sc.nextInt();
        if (pizzaType == 1){

        }
        if (pizzaChoice == 1){
            if(pizzaType == 1){
                pizza = new Pizza(true);
            }else{
                pizza = new Pizza(false);
            }
            System.out.println("Any extra Cheese? Y/N");
            String extraCheese = sc.next();
            if (extraCheese.equalsIgnoreCase("Y")){
                pizza.addExtraCheese();
            }

            System.out.println("Any Extra Toppings? Y/N");
            String extraToppings = sc.next();
            if (extraToppings.equalsIgnoreCase("Y")){
                pizza.addExtraToppings();
            }

            pizza.getBill();
        }else {
            if (pizzaType == 1){
                pizza = new DeluxePizza(true);
                pizza.getBill();
            }else {
                pizza = new DeluxePizza(false);
                pizza.getBill();
            }
        }
        sc.close();
    }
}