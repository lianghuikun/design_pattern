package com.example.state;


/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/25/025 21:27
 */
// 预定状态
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已经被预定！");
    }
}
