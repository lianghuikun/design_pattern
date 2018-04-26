package com.example.adapter;

// 被适配对象(ps/2键盘，笔记本无法直接连接)
public class Adaptee {
    public void request() {
        System.out.println("可以完成客户请求的需要的功能");
    }
}
