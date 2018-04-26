package com.example.adapter;


// 客户端，只有USB接口
public class Client {
    public void test1(Target t) {
        // 笔记本调用USB接口
        t.handleReq();
    }
    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
//        Target t = new Adpater();
        Target t = new Adpater2(a);
        c.test1(t);

    }
}
