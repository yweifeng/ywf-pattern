package com.ywf.pattern.singleton;

/**
 * 单例模式- 饿汉式
 * 优点： 没有加锁，执行效率高，线程安全
 * 缺点： 类加载就立即初始化，耗费资源
 *
 * @Author:ywf
 */
public class Singleton1 {

    private static final Singleton1 singleton = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton;
    }

}
