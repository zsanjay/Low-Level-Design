package org.sanjay.lld.design.patterns.creational.singleton.eager;

public class EagerInitialization {

    private static final EagerInitialization SINGLETON = new EagerInitialization();

    private EagerInitialization() {}

    public static EagerInitialization getInstance() {
        return SINGLETON;
    }
}
