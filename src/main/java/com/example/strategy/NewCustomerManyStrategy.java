package com.example.strategy;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/25/025 20:57
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("大批量打9折");
        return standardPrice * 0.9;
    }
}
