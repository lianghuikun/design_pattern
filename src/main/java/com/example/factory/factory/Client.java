package com.example.factory.factory;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/5/1/001 10:22
 */
public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        c1.run();
    }
}
