package org.sanjay.lld.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<Shape>();
    @Override
    public void draw(String fillColor) {
        for(Shape sh : shapes) {
            sh.draw(fillColor);
        }
    }
    public void add(Shape s) {
        this.shapes.add(s);
    }
    public void remove(Shape s) {
        shapes.remove(s);
    }
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
