package Strategy;

public class PayByPayPal implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        verifyPayment();
        System.out.println("Paid " + amount + " using PayPal.");
    }

    // all other internal PayPal specific methods
    private void verifyPayment(){
        System.out.println("Verifying PayPal payment...");
    }
}
