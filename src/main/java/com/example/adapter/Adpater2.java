package com.example.adapter;

// 适配器，相当于USB和PS/2传接口
// 需要把PS/2和USB连接起来，因此需要实现Target
//public class Adpater2 extends Adaptee implements Target {
public class Adpater2 implements Target {
    // 需要和被适配者本身有两种方式，一种是继承(类适配器方式）
    // 另一种方式，组合方式
    private Adaptee adaptee;

    public Adpater2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
