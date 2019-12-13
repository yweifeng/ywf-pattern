package com.ywf.pattern.singleton;

/**
 * 懒汉式
 * 优点： 使用时才去实例化对象
 * 缺点： 线程不安全
 * @Author:ywf
 */
public class Singleton2 {
    private static Singleton2 singleton;

    public static Singleton2 getInstance() {
        if (null == singleton) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
