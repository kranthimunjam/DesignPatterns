package Strategy;

public class PayByCreditCard implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        authenticate();
        System.out.println("Paid " + amount + " using Credit Card.");
    }

    private void authenticate() {
        System.out.println("Authenticating credit card...");
    }
}
