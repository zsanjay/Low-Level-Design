package org.sanjay.lld.design.patternsV2.creational.singleton;
/*
 * ThreadSafeSingleton ensures that only one instance of the class is created
 * even when accessed by multiple threads simultaneously.
 * It uses synchronized method to control access to the instance creation.
 * ✅ Thread-safe
 * ❌ Slower due to method-level synchronization
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {
        // private constructor to prevent instantiation
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
