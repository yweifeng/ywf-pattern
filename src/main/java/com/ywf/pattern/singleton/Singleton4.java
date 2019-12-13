package com.ywf.pattern.singleton;

/**
 * 懒汉式 双重验证锁机制
 * 优点：解决了懒汉式的多线程问题，又解决了资源浪费的现象
 *
 * @Author:ywf
 */
public class Singleton4 {
    private static Singleton4 singleton;

    public static Singleton4 getInstance() {

        if (null == singleton) {
            synchronized (Singleton4.class) {
                if (null == singleton) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
