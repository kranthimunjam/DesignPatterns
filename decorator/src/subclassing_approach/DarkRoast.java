package subclassing_approach;

public class DarkRoast extends Beverage {

    public DarkRoast() {}

    public String getDescription(){
        return super.description+" with DarkRoast";
    }

    /**
     * each subclass overrides this to provide the cost.
     *
     * @return double cost of the coffee.
     */
    @Override
    public double getCost() {
        return 12.99;
    }
}
