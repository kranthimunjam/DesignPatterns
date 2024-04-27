package subclassing_approach;

public class Decaf extends Beverage{
    public Decaf() {}

    public String getDescription(){
        return super.description+" with Decaf";
    }

    /**
     * each subclass overrides this to provide the cost.
     *
     * @return double cost of the coffee.
     */
    @Override
    public double getCost() {
        return 15.99;
    }
}
