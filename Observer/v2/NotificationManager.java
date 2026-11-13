package observer.v2;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings ("deprecation")
public class NotificationManager  implements Observer {

    @Override
    public void update(Observable observable, Object notification) { 
        //since we get the observable object, we can unsubscribe if needed
        // and also this can be called by many observables, 
        // so we can do different things based on the observable object.
        if(observable instanceof OrderManager) {
            getNotification((String) notification);
        }
    }

    public void getNotification(String message) {
        System.out.println("NotificationManager received notification: " + message);
    }

    public void unsubscribe(Observable observable) {
        observable.deleteObserver(this);
    }
    
}
