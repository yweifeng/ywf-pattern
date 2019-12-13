package com.ywf.pattern.factory.simplefactory;

/**
 * @Author:ywf
 */
public class ShapeFactory {

    public static IShape getShape(String shapeType) {
        if ("circle".equals(shapeType)) {
            return new Circle();
        } else if ("rectangle".equals(shapeType)) {
            return new Rectangle();
        }
        return null;
    }
}
