package strategy;

public class Client {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(100);
        // client creates a payment strategy and passes it to the order(context)
        orderManager.setPaymentStrategy(new PayByCreditCard());
        // order doesn't know the concrete strategy. It executes the strategy method
        orderManager.processOrder();
    }
}
