package com.example.observer;


/**
 * 具体主题
 */
public class ConcreteSubject extends Subject{
    private int state;
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        // 如果目标对象(主题)状态变化，请通知所有的观察者
        this.notifyAllObservers();
    }
}
