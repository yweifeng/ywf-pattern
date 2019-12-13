package com.ywf.pattern.factory.abstractfactory;

/**
 * 奥迪工厂
 * @Author:ywf
 */
public class AudiCarFactory extends CarFactory {
    @Override
    public ITire createTire() {
        return new AudiTire();
    }

    @Override
    public IEngine createEngine() {
        return new AudiEngine();
    }
}
