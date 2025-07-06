package org.sanjay.lld.design.patternsV2.creational.singleton;

/*
    * Enum Singleton implementation
    * ✅ Thread-safe
    * ✅ Serialization-safe
    * ✅ Reflection-safe
    * ✅ Simple
    * This is the most recommended way to implement a singleton in Java.
    * It uses the Java Enum type, which provides serialization and reflection safety.
    * The instance is created when the enum is loaded, ensuring thread safety.
 */
public enum Singleton {
    INSTANCE;
}
