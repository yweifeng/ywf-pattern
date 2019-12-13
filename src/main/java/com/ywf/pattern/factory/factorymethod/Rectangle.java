package com.ywf.pattern.factory.factorymethod;

import com.ywf.pattern.factory.simplefactory.IShape;

/**
 * @Author:ywf
 */
public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("绘制正方形");
    }
}
