package com.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象
 */
public class Subject {
    protected List<Observer> list = new ArrayList<>();
    public void registerObserver(Observer obs) {
        list.add(obs);
    }
    public void removeObserver(Object obs) {
        list.remove(obs);
    }
    // 通知所有的观察者更新状态
    public void notifyAllObservers() {
        for (Observer observer : list) {
            // 通知观察这更新当亲啊对象
            observer.update(this);
        }
    }
}
