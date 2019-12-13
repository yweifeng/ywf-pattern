package com.ywf.pattern.singleton;

/**
 * 静态内部类
 * 优点: 1、客户端使用单例模式的实例，只需要调用一个单一的方法即可生成唯一的实例，有利于节约资源
 *       2、允许可变数目的实例
 * 缺点：1、单例模式没有抽象层，因此扩展困难，若要扩展，除非修改代码
 *       2、由于单例模式采用静态方法，无法在继承结构中使用
 *
 * @Author:ywf
 */
public class Singleton5 {
    private Singleton5(){}
    private static class InnerSingleton {
        private static final Singleton5 singleton = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return InnerSingleton.singleton;
    }
}
