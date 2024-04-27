package subclassing_approach;

/**
 * Each combination will be a new subclass and
 * since there will be many subclasses, there will be an explosion of classes.
 */
public class DecafWithSoyAndMocha extends Beverage{

    public DecafWithSoyAndMocha() {
    }

    public String getDescription(){
        return super.description+" with Decaf, Soy And, Mocha";
    }

    /**
     * each subclass overrides this to provide the cost.
     *
     * @return double cost of the coffee.
     */
    @Override
    public double getCost() {
        return 26.99;
    }
}
