public class DeluxePizza extends Pizza{
    DeluxePizza(boolean pizzaBase){
        super(pizzaBase);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
