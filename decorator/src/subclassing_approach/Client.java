package subclassing_approach;

public class Client {
    public static void main(String[] args){
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription()+" : "+darkRoast.getCost());

        Beverage customDecaf = new DecafWithSoyAndMocha();
        System.out.println(customDecaf.getDescription()+" : "+customDecaf.getCost());

    }
}
