package com.example.factory.factory;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/5/1/001 10:22
 */
public class BydFactory implements CarFacotry {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
