package com.example.singleton;


/**
 * 枚举单例
 *  枚举天然就是单例的
 * 优点：
 *  实现简单
 *  枚举本身就是单例的，由jvm从根本上提供保障。避免通过反射和反序列化的漏洞
 * 缺点：
 *  无延迟加载
 *
 * 所谓反射的漏洞：
 *  构造器私有了，也可以通过反射去调
 */
public enum SingletonDemo5 {
    /**
     * 定义一个枚举的元素，它代表了Singleton的一个实例
     */
    INSTANCE;

    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation() {
        // 功能处理
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo5.INSTANCE);
        System.out.println(SingletonDemo5.INSTANCE);
        System.out.println(SingletonDemo5.INSTANCE);

    }
}
