package com.ywf.pattern.singleton;

/**
 * 懒汉式 优化 加锁 synchronized
 * 优点： 线程安全
 * 缺点： 每次都去创建锁，锁粒度太大，而真正需要加锁是在实例化对象的时候
 * @Author:ywf
 */
public class Singleton3 {
    private static Singleton3 singleton;

    public static synchronized Singleton3 getInstance() {
        if (null == singleton) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}
