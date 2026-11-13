package singleton.synchronizedimpl;

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

        // log time before starting the threads
        long startTime = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        
        // wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
