package org.sanjay.lld.design.patternsV2.creational.singleton;

/**
 * Bill Pugh Singleton Design Pattern
 * This pattern uses a static inner helper class to hold the singleton instance.
 * The instance is created only when the getInstance() method is called, ensuring lazy initialization.
 * ✅ Thread-safe
 * ✅ Lazy-loaded
 * ✅ No synchronization overhead
 */
public class BillPugh {
    private BillPugh() {
        // private constructor to prevent instantiation
    }
    private static class SingletonHelper {
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
