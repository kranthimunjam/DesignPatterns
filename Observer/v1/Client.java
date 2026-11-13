package observer.v1;

public class Client {
    public static void main(String[] args) {
        // create publisher
        OrderManager orderManager = new OrderManager();
        
        // create subscribers
        Subscriber warehouseService = new WarehouseService(orderManager);
        Subscriber notificationService = new NotificationService(orderManager);
        
        
        // publish a message
        orderManager.placeOrder("New order received!");
    }
}
