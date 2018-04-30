package com.example.singleton;


/**
 * 双重检测锁
 * 懒汉和饿汉，分别在调用效率 和  资源效率上有问题
 * 由此引伸出三种。
 * 双重检测所: 不建议使用，jvm内存模型有问题，导致有时候出错
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance = null;


    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo3.class) {
                        if (sc == null) {
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }
}
