package com.example.factory.abstractFactory;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/5/1/001 11:02
 */
public class Client {
    public static void main(String[] args) {
        // 豪车
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        System.out.println(e);
    }
}
