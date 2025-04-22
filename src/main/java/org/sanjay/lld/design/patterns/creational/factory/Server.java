package org.sanjay.lld.design.patterns.creational.factory;

public class Server extends Computer {
    private String ram;
    private String cpu;
    private String hdd;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}
