package org.sanjay.lld.design.patterns.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket sock = new Socket();
    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(sock.getVolt(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(sock.getVolt(), 40);
    }

    private Volt convertVolt(Volt v , int i) {
        return new Volt(v.getVolts() / i);
    }
}
