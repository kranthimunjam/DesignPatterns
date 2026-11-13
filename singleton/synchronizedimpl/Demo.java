package synchronizedimpl;

public class Demo {
    public static void main(String[] args) { 
        Thread thread1 = new Thread(() -> {
            SynchronizedSingleton singleton1 = SynchronizedSingleton.getInstance();
            System.out.println("Thread 1: " + singleton1);
        });

        Thread thread2 = new Thread(() -> {
            SynchronizedSingleton singleton2 = SynchronizedSingleton.getInstance();
            System.out.println("Thread 2: " + singleton2);
        });

        thread1.start();
        thread2.start();

        // output:
        // Thread 1: synchronizedimpl.SynchronizedSingleton@15db9742
        // Thread 2: synchronizedimpl.SynchronizedSingleton@15db9742
    }
}
