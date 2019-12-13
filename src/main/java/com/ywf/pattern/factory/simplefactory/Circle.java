package com.ywf.pattern.factory.simplefactory;

/**
 * @Author:ywf
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
