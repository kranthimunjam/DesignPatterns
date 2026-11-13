package singleton.naiveimpl;

public class NaiveSingleton {
    private static NaiveSingleton instance;

    private NaiveSingleton() {
        // Private constructor to prevent instantiation
    }

    public static NaiveSingleton getInstance() {
        if (instance == null) {
            instance = new NaiveSingleton();
        }
        return instance;
    }
}
