package v2;

public class Client {
    public static void main(String[] args) {
        // create publisher
        OrderManager orderManager = new OrderManager();
        
        // create subscribers
        WarehouseManager warehouseManager = new WarehouseManager();
        NotificationManager notificationManager = new NotificationManager();
        
        // subscribe to the publisher
        orderManager.addObserver(warehouseManager);
        orderManager.addObserver(notificationManager);
        
        // publish a message
        orderManager.placeOrder("Order1");
        
        // unsubscribe from the publisher
        warehouseManager.unsubscribe(orderManager);

        // publish another message
        orderManager.placeOrder("Order2");
    }
}
