public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if (type == PizzaType.CHEESE) {
            pizza = new CheesePizza();
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new PepperoniPizza();
        } else{
            System.out.println("Invalid pizza type");
        }
        return pizza;
    }
}
