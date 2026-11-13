package observer.v2;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class WarehouseManager implements Observer {

    @Override
    public void update(Observable observable, Object notification) {
        if(observable instanceof OrderManager) {
            getNotification((String) notification);
        }
    }

    public void getNotification(String message) {
        System.out.println("WarehouseManager received notification: " + message);
    }

    public void unsubscribe(Observable observable) {
        observable.deleteObserver(this);
    }
    
}
