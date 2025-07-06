package org.sanjay.lld.design.patternsV2.creational.factory;

public class Server extends Computer {
    private final String RAM;
    private final String HDD;
    private final String CPU;
    public Server(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getHDD() {
        return HDD;
    }

    @Override
    public String getCPU() {
        return CPU;
    }

    @Override
    public String toString() {
        return String.format("Server{RAM='%s', HDD='%s', CPU='%s'}", getRAM(), getHDD(), getCPU());
    }
}
