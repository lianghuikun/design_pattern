package com.example.state;


/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/25/025 21:27
 */
// 已入住
public class CheckedState implements State {
    @Override
    public void handle() {
        System.out.println("已入住！");
    }
}
