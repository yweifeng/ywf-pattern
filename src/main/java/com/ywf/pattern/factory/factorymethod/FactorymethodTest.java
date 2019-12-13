package com.ywf.pattern.factory.factorymethod;

import com.ywf.pattern.factory.simplefactory.IShape;

/**
 * @Author:ywf
 */
public class FactorymethodTest {
    public static void main(String[] args) {
        IShape circle = new CircleFactory().getShape();
        circle.draw();

        IShape rectangle = new RectangleFactory().getShape();
        rectangle.draw();
    }
}
