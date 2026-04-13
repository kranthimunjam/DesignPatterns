package Observer;

public class NotificationService implements Subscriber {
    @Override
    public void getNotification(String message) {
        System.out.println("NotificationService received notification: " + message);
    }
    
}
