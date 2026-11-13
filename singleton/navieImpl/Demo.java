package navieImpl;

public class Demo {
    public static void main(String[] args) { 
        Thread thread1 = new Thread(() -> {
            NaiveSingleton singleton1 = NaiveSingleton.getInstance();
            System.out.println("Thread 1: " + singleton1);
        });

        Thread thread2 = new Thread(() -> {
            NaiveSingleton singleton2 = NaiveSingleton.getInstance();
            System.out.println("Thread 2: " + singleton2);
        });

        thread1.start();
        thread2.start();

        // output:
        // Thread 1: singleton.NaiveSingleton@15db9742
        // Thread 2: singleton.NaiveSingleton@1a949206


    }
}
