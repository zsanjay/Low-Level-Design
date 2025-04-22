package org.sanjay.lld.design.patterns.creational.builder;

public class Computer {
    private String HDD;
    private String RAM;
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }
    public String getRAM() {
        return RAM;
    }
    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
    private Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;

        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
            this.isGraphicCardEnabled = isGraphicCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
