package Observer;

public class WarehouseService implements Subscriber {
    @Override
    public void getNotification(String message) {
        System.out.println("WarehouseService received notification: " + message);
    }
    
}
