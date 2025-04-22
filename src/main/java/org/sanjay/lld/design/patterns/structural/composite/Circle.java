package org.sanjay.lld.design.patterns.structural.composite;

public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Cirle with color " + fillColor);
    }
}
