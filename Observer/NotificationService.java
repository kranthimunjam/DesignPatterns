
public class NotificationService implements Subscriber {
    // We need a reference to the OrderManager to subscribe to it and receive notifications 
    // and later unsubscribe if needed.
    OrderManager orderManager;

    public NotificationService(OrderManager orderManager) {
        this.orderManager = orderManager;
        this.orderManager.subscribe(this);
    }

    @Override
    public void getNotification(String message) {
        System.out.println("NotificationService received notification: " + message);
    }

    public void unsubscribe() {
        this.orderManager.unsubscribe(this);
    }
    
}
