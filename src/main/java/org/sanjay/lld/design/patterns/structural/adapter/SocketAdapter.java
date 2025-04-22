package org.sanjay.lld.design.patterns.structural.adapter;

public interface SocketAdapter {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
