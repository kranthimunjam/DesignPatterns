package Observer;

import java.util.ArrayList;
import java.util.List;
// Ideally this would be implementing an interface like Subject, 
// but for simplicity, we are directly using it as the subject in this example.

public class OrderManager {
    List<Subscriber> subscribers = new ArrayList<>();
    List<String> orders = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void placeOrder(String orderDetails) {
        System.out.println("Order placed: " + orderDetails);
        orders.add(orderDetails);
        notifySubscribers("New order placed: " + orderDetails);
    }

   public void notifySubscribers(String message) {
        subscribers.forEach(subscriber -> subscriber.getNotification(message));
    }
    
}
