package org.sanjay.lld.design.patterns.behavioral.state;

public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
