package com.example.strategy;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/25/025 21:00
 */
public class Context {
    // 当前采用的算法,具体算法和客户端分离了
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void printPrice(Double s) {
        System.out.println("--->:" + this.strategy.getPrice(s));
    }
}
