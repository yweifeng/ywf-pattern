package com.ywf.pattern.factory.simplefactory;

/**
 * @Author:ywf
 */
public class ReflectSimpleFactoryTest {
    public static void main(String[] args) {
        Circle circle = (Circle) ReflectShapeFactory.getShape(Circle.class);
        circle.draw();

        Rectangle rectangle = (Rectangle) ReflectShapeFactory.getShape(Rectangle.class);
        rectangle.draw();
    }
}
