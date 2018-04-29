package com.example.observer;

/**
 * @Author: lianghuikun
 * @Description: 观察者小A
 * @Date: 2018/4/29/029 14:52
 */
public class ObserverA implements Observer{
    // 假设myState需要和目标对象的值保持一致
    private int myState;
    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
