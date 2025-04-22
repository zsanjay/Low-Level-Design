package org.sanjay.lld.design.patterns.creational.builder;

public class TestBuilderPattern {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "2 GB")
                .setBluetoothEnabled(true).setGraphicCardEnabled(true).build();
    }
}
