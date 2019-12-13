package com.ywf.pattern.factory.factorymethod;

import com.ywf.pattern.factory.simplefactory.IShape;

/**
 * @Author:ywf
 */
public class RectangleFactory implements IShapeFactory {
    @Override
    public IShape getShape() {
        return new Rectangle();
    }
}
