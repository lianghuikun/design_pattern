package com.example.strategy;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/25/025 20:57
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价!");
        return standardPrice;
    }
}
