package com.example.adapter;

// 适配器，相当于USB和PS/2传接口
// 需要把PS/2和USB连接起来，因此需要实现Target
public class Adpater extends Adaptee implements Target {

    // 需要和被适配者本身有两种方式，一种是继承

    @Override
    public void handleReq() {
        super.request();
    }
}
