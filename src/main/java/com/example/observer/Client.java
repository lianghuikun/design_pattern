package com.example.observer;

/**
 * 观察者模式observer
 */
public class Client {
    public static void main(String[] args) {
        // 目标对象
        ConcreteSubject subject = new ConcreteSubject();
        // 创建多个观察者
        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();
        // 注册三个观察者
        subject.registerObserver(a);
        subject.registerObserver(b);
        subject.registerObserver(c);
        // 改变subject的状态
        subject.setState(3000);
        // 查看观察者是否检测到，并同步自己的状态
        System.out.println(a.getMyState());
        System.out.println(b.getMyState());
        System.out.println(c.getMyState());

    }
}
