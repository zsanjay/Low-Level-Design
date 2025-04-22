package org.sanjay.lld.design.patterns.creational.singleton.doubleLock;

public class DoubleLockCheckingSingleton {
    private static volatile DoubleLockCheckingSingleton singleton;
    private DoubleLockCheckingSingleton(){}

    public static DoubleLockCheckingSingleton getInstance() {
        if(singleton == null) {
            synchronized (DoubleLockCheckingSingleton.class) {
                if(singleton == null) {
                    singleton = new DoubleLockCheckingSingleton();
                }
            }
        }
        return singleton;
    }
}
