package com.ywf.pattern.factory.abstractfactory;

/**
 * 抽象汽车工厂
 * @Author:ywf
 */
public abstract class CarFactory {

    /**
     * 生产轮胎
     * @return 轮胎
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     * @return 发动机
     */
    public abstract IEngine createEngine();
}
