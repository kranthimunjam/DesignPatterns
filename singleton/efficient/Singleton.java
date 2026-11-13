package singleton.efficient;

// this is much more efficient than the synchronized implementation, 
// as it reduces the overhead of acquiring a lock every time getInstance() is called, 
// while still ensuring that only one instance of the class is created.
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            // Below block is executed only when instance is null, 
            // reducing the overhead of acquiring a lock every time getInstance() is called.
            synchronized (Singleton.class) { 
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
