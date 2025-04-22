package org.sanjay.lld.design.patterns.structural.adapter;

public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
