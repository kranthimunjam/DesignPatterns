package subclassing_approach;

public abstract class Beverage {
    String description = "Coffee ";

    public Beverage(){}

    public String getDescription(){
        return description;
    }

    /**
     * each subclass overrides this to provide the cost.
     * @return double cost of the coffee.
     */
    abstract public double getCost();
}
