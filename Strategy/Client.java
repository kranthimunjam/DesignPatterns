package Strategy;

public class Client {
    public static void main(String[] args) {
        Order order = new Order(100);
        // client creates a payment strategy and passes it to the order(context)
        order.setPaymentStrategy(new PayByCreditCard());
        // order doesn't know the concrete strategy. It executes the strategy method
        order.processOrder();
    }
}
