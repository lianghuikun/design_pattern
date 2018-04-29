package com.example.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理中，代理类由代码生成
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class},
                handler);
        proxy.bookTicket();
        proxy.sing();
    }
}
