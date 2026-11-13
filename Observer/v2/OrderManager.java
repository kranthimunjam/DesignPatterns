package observer.v2;

import java.util.Observable;
import java.util.Observer;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class OrderManager extends Observable {
    List<Observer> observers;

    public OrderManager() {
        observers = new ArrayList<>();
    }

    public void placeOrder(String orderDetails) {
        setChanged(); // Mark the observable as changed
        notifyObservers("New order placed: " + orderDetails); // Notify all observers
    }
    
}
