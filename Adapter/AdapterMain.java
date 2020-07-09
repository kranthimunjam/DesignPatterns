package Adapter;

public class AdapterMain {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println(" The Turkey says...");
		
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\n The Duck says...");
		testDuck(duck);
		
		System.out.println("\n The TurkeyAdapter says...");
		testDuck(turkeyAdapter);

	}
	
	// This method is client, expecting objects of Duck interface. So our Adapter converts Turkeys into Ducks.
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
