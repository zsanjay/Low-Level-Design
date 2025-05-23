package org.sanjay.lld.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if(shapeImpl == null) {
            if(type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if(type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false);
            } else if(type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    public static enum ShapeType {
        OVAL_FILL,OVAL_NOFILL,LINE;
    }
}
