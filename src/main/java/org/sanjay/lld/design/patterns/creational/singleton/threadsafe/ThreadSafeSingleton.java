package org.sanjay.lld.design.patterns.creational.singleton.threadsafe;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singleton;
    private ThreadSafeSingleton() {}
    public static synchronized ThreadSafeSingleton getInstance() {
        if(singleton == null) {
            singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }
}
