package com.ywf.pattern.factory.abstractfactory;

/**
 * 宝马工厂
 * @Author:ywf
 */
public class BmwCarFactory extends CarFactory {
    @Override
    public ITire createTire() {
        return new BmwTire();
    }

    @Override
    public IEngine createEngine() {
        return new BmwEngine();
    }
}
