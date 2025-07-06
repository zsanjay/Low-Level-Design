package org.sanjay.lld.design.patternsV2.creational.singleton;
/*
 * EagerSingleton is a singleton implementation that creates the instance at the time of class loading.
 * This ensures that the instance is created even before it is needed, which can be beneficial in some cases.
 * ✅ Thread-safe
 * ❌ Instance created even if not used
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();
    private EagerSingleton() {
        // private constructor to prevent instantiation
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
