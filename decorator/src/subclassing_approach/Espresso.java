package subclassing_approach;

public class Espresso extends Beverage{
    public Espresso() {}

    public String getDescription(){
        return super.description+" with Espresso";
    }

    /**
     * each subclass overrides this to provide the cost.
     *
     * @return double cost of the coffee.
     */
    @Override
    public double getCost() {
        return 21.99;
    }
}
