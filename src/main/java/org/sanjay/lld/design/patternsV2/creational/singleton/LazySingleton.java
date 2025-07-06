package org.sanjay.lld.design.patternsV2.creational.singleton;
/*
 * Lazy Singleton implementation
 * ✅ Thread-safe (not in a multi-threaded environment)
 * ❌ Not thread-safe in multithreaded environments
 * ❌ Not serialization-safe
 * ❌ Not reflection-safe
 * ❌ Can lead to multiple instances in a multi-threaded environment
 * This implementation creates the instance only when it is requested for the first time.
 * It is not thread-safe and can lead to multiple instances if accessed by multiple threads simultaneously.
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {
        // private constructor to prevent instantiation
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
