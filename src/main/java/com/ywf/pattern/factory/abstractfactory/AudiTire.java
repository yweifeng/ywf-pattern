package com.ywf.pattern.factory.abstractfactory;

/**
 * @Author:ywf
 */
public class AudiTire implements ITire {
    @Override
    public void tire() {
        System.out.println("奥迪轮胎");
    }
}
