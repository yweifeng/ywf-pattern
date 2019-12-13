package com.ywf.pattern.factory.simplefactory;

/**
 * @Author:ywf
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        IShape circle = ShapeFactory.getShape("circle");
        circle.draw();

        IShape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}
