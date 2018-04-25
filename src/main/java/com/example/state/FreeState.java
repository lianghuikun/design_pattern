package com.example.state;


/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/25/025 21:27
 */
// 空闲状态
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲，没人住！");
    }
}
