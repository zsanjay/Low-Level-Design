package org.sanjay.lld.design.patterns.behavioral.iterator;

public class Channel {
    private double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double frequency, ChannelTypeEnum type) {
        this.frequency = frequency;
        this.TYPE = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    public String toString() {
        return "Frequency=" + this.frequency+ ", Type=" + this.TYPE;
    }
}
