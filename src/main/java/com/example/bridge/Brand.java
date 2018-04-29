package com.example.bridge;

// 品牌维度
public interface Brand {
    void sale();
}

class Lenovo implements Brand {
    public void sale() {
        System.out.println("联想品牌电脑");
    }
}

class Dell implements Brand {
    public void sale() {
        System.out.println("戴尔品牌电脑");
    }
}

// 如果新加品牌，在这新增子类就可以了，不会影响到电脑