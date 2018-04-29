package com.example.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/29/029 16:31
 */
public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // method.invoke(realStar, args);
        // 只要调用代理类的方法，肯定会到这里，可以在这进行流程控制
        method.invoke(realStar, args);
        return null;
    }
}
