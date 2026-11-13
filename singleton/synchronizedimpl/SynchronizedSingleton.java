package singleton.synchronizedimpl;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        // Private constructor to prevent instantiation
    }

    /*
        * Synchronized method to control simultaneous access to the getInstance() method.
        * The issue here is only one thread can access this method at a time, 
        * which can lead to performance issues in a multi-threaded environment.
     */
    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
            try {
                Thread.sleep(1000); // Simulate some delay of a heavy object construction.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}
