package Observer;

public class Client {
    public static void main(String[] args) {
        // create publisher
        OrderManager orderManager = new OrderManager();
        
        // create subscribers
        Subscriber warehouseService = new WarehouseService();
        Subscriber notificationService = new NotificationService();
        
        // subscribe to publisher
        orderManager.subscribe(warehouseService);
        orderManager.subscribe(notificationService);
        
        // publish a message
        orderManager.placeOrder("New order received!");
    }
}
