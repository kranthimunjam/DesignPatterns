package subclassing_approach;

public class HouseBlend extends Beverage{
    public HouseBlend() {
    }

    public String getDescription(){
        return super.description+" with HouseBlend";
    }

    /**
     * overrides parent to provide the cost.
     *
     * @return double cost of the HouseBlend.
     */
    @Override
    public double getCost() {
        return 10.99;
    }
}
