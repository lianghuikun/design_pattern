package com.example.singleton;


/**
 * 单例实现方式一：饿汉模式单例
 */
public class SingletonDemo1 {
    /**
     * 类初始化时，立即加载，因为只初始化一次，不会有线程安全问题
     * 优点： 线程安全不需要同步，效率高
     * 缺点：
     * 不能延迟加载(懒加载)，上来就new，万一不用调用呢
     */
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {

    }

    public static SingletonDemo1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo1 s = SingletonDemo1.getInstance();
        System.out.println(s);
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        System.out.println(s1);
    }
}
