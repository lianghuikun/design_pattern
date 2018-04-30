package com.example.singleton;

/**
 * 懒汉模式
 *      优点：懒加载、延迟加载，真正用的时候才加载
 *      缺点：资源效率高了。但是，调用效率低了，需要加同步
 *
 *      需要根据调用效率和资源效率来决定用懒汉，还是饿汉
 *      或者用后面的模式
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;
    private SingletonDemo2(){

    }
    // 方法同步，调用效率低
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
