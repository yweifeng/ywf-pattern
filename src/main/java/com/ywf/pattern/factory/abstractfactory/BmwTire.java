package com.ywf.pattern.factory.abstractfactory;

/**
 * @Author:ywf
 */
public class BmwTire implements ITire {
    @Override
    public void tire() {
        System.out.println("宝马轮胎");
    }
}
