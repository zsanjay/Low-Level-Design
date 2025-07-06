package org.sanjay.lld.design.patternsV2.creational.singleton;

/**
 * Double-checked locking is a design pattern that reduces the overhead of acquiring a lock by first checking the locking criterion without actually acquiring the lock.
 * If the criterion is not met, then the lock is acquired and checked again.
 * This pattern is used to implement thread-safe singleton classes.
 * ✅ Efficient and thread-safe
 * 🔧 Requires volatile for visibility guarantees
 */
public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {
        // private constructor to prevent instantiation
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
