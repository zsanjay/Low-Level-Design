package org.sanjay.lld.design.patterns.structural.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
