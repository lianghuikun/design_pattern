package com.example.singleton;


/**
 * 静态内部类实现单例
 * 优点： 强烈推荐使用
 *      兼具了高效调用和延迟加载的优势(很多框架这么使用)
 *      解决了懒汉和饿汉的效率问题
 *      1、可以实现单例
 *      2、是一种懒加载
 *      3、调用效率高，无锁，线程安全
 *
 *      初始化SingletonDemo4时，不会初始化她的静态内部类，调用方法时才会
 *      类加载的过程是天然的线程安全的
 */
public class SingletonDemo4 {

    // 2、内部类
    private static class SingletonClassInstance {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }
    // 1、私有化构造
    private SingletonDemo4() {

    }

    public static SingletonDemo4 getInstance() {
        return SingletonClassInstance.instance;
    }

    public static void main(String[] args) {
        SingletonDemo4 s = SingletonDemo4.getInstance();
        System.out.println(s);
        SingletonDemo4 s1 = SingletonDemo4.getInstance();
        System.out.println(s1);
    }
}
