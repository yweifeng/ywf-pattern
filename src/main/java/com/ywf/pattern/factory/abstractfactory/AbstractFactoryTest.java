package com.ywf.pattern.factory.abstractfactory;

/**
 * @Author:ywf
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        BmwCarFactory bmwCarFactory = new BmwCarFactory();

        bmwCarFactory.createTire().tire();
        bmwCarFactory.createEngine().engine();

        AudiCarFactory audiCarFactory = new AudiCarFactory();
        audiCarFactory.createTire().tire();
        audiCarFactory.createEngine().engine();

    }
}
